package org.springHibernate.usermsg.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.HbmBinder;
import org.hibernate.metamodel.source.hbm.HbmBindingContext;
import org.springHibernate.beans.Student;
import org.springHibernate.usermsg.dao.IStudentDao;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDaoImpl  implements IStudentDao{
	
	
	@Resource
	private SessionFactory	 sf;
	
	@Override
	public int saveStudent(Student stu) {
		// TODO Auto-generated method stub
		return (int) sf.getCurrentSession().save(stu);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		System.out.println(id+"-----------====dfdf============");
		
		String hql="from Student as s where s.id=?";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);
		Student stu=null;
		if(query.list().size()>0){
			System.out.println(query.list());
			stu=(Student) query.list().get(0);
			
		}	
		return stu;
	}

	@Override
	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(stu);
	}
	
	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(stu);
	}

	@Override
	public List<?> selectStudentByStudentName(String studengName) {
		// TODO Auto-generated method stub
		String hql="from Student as s where s.student_name like CONCAT(?,'%')";
		Query query= sf.getCurrentSession().createQuery(hql);
		query.setString(0, studengName);
		return query.list();
	}

	@Override
	public List<?> showAllStudent(Map map) {
		System.out.println((int) map.get("id"));
		System.out.println((int)map.get("number"));
		System.out.println((int) map.get("size"));
		 
		String hql="select  new Map(s.id as id,s.studentName as studentName,c.className as className )from  Classes as c , Student as s where c.id=s.cla.id and c.id=? ";
		
		Query query=sf.getCurrentSession().createQuery(hql);		
		query.setInteger(0, (int) map.get("id"));
		query.setInteger(1, (int) map.get("number"));
		query.setInteger(2, (int) map.get("size"));
		return query.list() ;
	}
  




}

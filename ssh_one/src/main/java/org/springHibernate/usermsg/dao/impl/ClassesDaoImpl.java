package org.springHibernate.usermsg.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springHibernate.beans.Classes;
import org.springHibernate.usermsg.dao.IClassesDao;
import org.springframework.stereotype.Repository;


@Repository
public class ClassesDaoImpl implements IClassesDao{
	@Resource
	private SessionFactory sf;
	
	@Override
	public Classes getClassesByClassName(String name) {
		String hql="from Classes as c where c.className = ? ";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setString(0, name);
		Classes c=null;
		if(query.list().size()>0){
			c = (Classes) query.list().get(0);
			c.getStu().iterator();
			
			
		}
		return c;
	}
	
}

package org.springHibernate.usermsg.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springHibernate.beans.Student;
import org.springHibernate.usermsg.dao.IStudentDao;
import org.springHibernate.usermsg.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private IStudentDao studentDaoImpl;
	@Override
	public int saveStudent(Student stu) {
		// TODO Auto-generated method stub
		return studentDaoImpl.saveStudent(stu);
	}

	@Override
	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteStudent(stu);
	}
	
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDaoImpl.getStudentById(id);
	}
	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.updateStudent(stu);
	}

	@Override
	public List<?> selectStudentByStudentName(String studengName) {
		// TODO Auto-generated method stub
		return studentDaoImpl.selectStudentByStudentName(studengName);
	}

	@Override
	public List<?> showAllStudent(Map map) {
		// TODO Auto-generated method stub
		return studentDaoImpl.showAllStudent(map);
	}



}

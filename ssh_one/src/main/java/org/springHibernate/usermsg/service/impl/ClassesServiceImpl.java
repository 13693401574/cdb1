package org.springHibernate.usermsg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springHibernate.beans.Classes;
import org.springHibernate.usermsg.dao.IClassesDao;
import org.springHibernate.usermsg.service.IClassesService;
import org.springframework.stereotype.Service;
@Service
public class ClassesServiceImpl implements IClassesService{

	@Resource
	private IClassesDao classesDaoImpl;
	
	@Override
	public Classes getClassesByClassName(String name) {
		// TODO Auto-generated method stub
		return classesDaoImpl.getClassesByClassName(name);
	}

}

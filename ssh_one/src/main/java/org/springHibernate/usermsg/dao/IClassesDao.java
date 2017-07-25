package org.springHibernate.usermsg.dao;

import java.util.List;

import org.springHibernate.beans.Classes;

public interface IClassesDao {
	/**
	 * 获得班级
	 * @param className 班级名称
	 * @return 班级对象
	 */
	public Classes getClassesByClassName(String name);
}

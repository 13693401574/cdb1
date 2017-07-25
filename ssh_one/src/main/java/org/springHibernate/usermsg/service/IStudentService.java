package org.springHibernate.usermsg.service;

import java.util.List;
import java.util.Map;

import org.springHibernate.beans.Student;

public interface IStudentService {
	/**
	 * 新增一个学生
	 * @param stu 学生对象
	 * @return 返回数据库行数
	 */
	public int saveStudent(Student stu);
	/**
	 * 获得一个学生
	 * @param id 学生id
 	 * @return 学生对象
	 */
	public Student getStudentById(int id);
	/**
	 * 删除学生
	 * @param stu 学生对象
	 */
	public void deleteStudent(Student stu);
	/**
	 * 修改学生
	 * @param stu 学生对象
	 * 
	 */
	public void updateStudent(Student stu);
	/**
	 * 查询学生
	 * @param studengName 学生姓名
	 * @return 学生集合
	 */
	public List<?> selectStudentByStudentName(String studengName);
	/**
	 * 显示所有的学生信息
	 * @return
	 */
	public List<?> showAllStudent(Map map);
	
	
}

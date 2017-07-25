package org.springHibernate.controller;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springHibernate.beans.Classes;
import org.springHibernate.beans.Student;
import org.springHibernate.beans.StudentAndClasssesModel;
import org.springHibernate.usermsg.service.IClassesService;
import org.springHibernate.usermsg.service.IStudentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/addStudent")
@RestController
public class StudentController {
	
	@Resource
	private IStudentService studentServiceImpl;
	@Resource
	private IClassesService classerServiceImpl;
	/**
	 * 新增一个学生
	 * @param requset
	 * @param response
	 * @return 学生对象
	 */
	@RequestMapping(value="/add",produces={"application/json;charset=utf-8"})
	@ResponseBody
	public StudentAndClasssesModel saveStudent(@RequestBody Map map){
		
		System.out.println(map.get("studentName"));
		System.out.println(map.get("className"));
		Classes cla=classerServiceImpl.getClassesByClassName((String) map.get("className"));
		System.out.println(cla);
		
		Student stu=new Student();
		stu.setCla(cla);
		stu.setStudentName((String) map.get("studentName"));	
		studentServiceImpl.saveStudent(stu);
		
		StudentAndClasssesModel sc=new StudentAndClasssesModel();
			sc.setCalss(cla);
			sc.setStudent(stu);

		return sc;	
	}
	
	@RequestMapping(value="/getSutdentById",produces={"application/json;charset=utf-8"})
	public @ResponseBody Student getStudentById(@RequestBody int id)throws Exception{
		Student stu=studentServiceImpl.getStudentById(id);
		System.out.println(stu);		
		return stu;
		
	};
	@RequestMapping(value="/stu",produces={"application/json;charset=utf-8"})
	public @ResponseBody List<?> getClasses(@RequestBody Map map){
		
		List<?> student=studentServiceImpl.showAllStudent(map);
		System.out.println(student);		
		return student;
		
	}
}

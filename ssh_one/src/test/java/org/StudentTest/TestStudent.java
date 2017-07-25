package org.StudentTest;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springHibernate.beans.Classes;
import org.springHibernate.beans.Student;
import org.springHibernate.usermsg.service.IClassesService;
import org.springHibernate.usermsg.service.IStudentService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestStudent {

	@Resource
	private IStudentService studentServiceImpl;
	@Resource
	private IClassesService classerServiceImpl;
	
	@Ignore
	public void saveStudentTest(){
		
		Classes cla=classerServiceImpl.getClassesByClassName("高三.一班");
		System.out.println(cla);
		
		Student stu=new Student();
		stu.setStudentName("四");
		stu.setCla(cla);
		

		studentServiceImpl.saveStudent(stu);
	}
	
	@Test
	public void shouAll(){
		Map map1=new HashMap();
		map1.put("id", 1);
		map1.put("number", 1);
		map1.put("size", 3);
		List<?> list=studentServiceImpl.showAllStudent(map1);
		System.out.println(list.get(0));
		Map map=(Map) list.get(1);
	System.out.println(map.get("className"));
	
	for(int a=0;a<list.size();a++){
		Map mapa=(Map) list.get(a);
	System.out.println(mapa.get("className"));
		
	}
	
	}
	
}

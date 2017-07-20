package org.cdb1.test;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestLandlady {

	@Resource
	private ILandladyService landladyServiceImpl;
	
	@Ignore
	public void testSaveLandlady(){
		LandladyBean land=new LandladyBean();
		land.setUserName("zh");
		land.setRealName("邹辉");
		land.setPwd("123456");
		land.setPhone("12345678901");
		land.setJobDescribe("自由职业者");
		land.setIdCard("511681198912030033");
		land.setEmail("1261301957@qq.com");
		land.setAddress("红瓦寺");
		landladyServiceImpl.saveLandlady(land);
	}

	@Ignore
	public void testGetLandladyById(){
		System.out.println(landladyServiceImpl.getLandladyById(1l));
	}
	@Test
	public void testUpdatLandlady(){
		LandladyBean land=landladyServiceImpl.getLandladyById(2l);
		System.out.println(land);
		land.setPhone("78945632101");
		land.setAddress("搞hsdfghbjnkjh");
		
		landladyServiceImpl.updateLandlady(land);
	}
}

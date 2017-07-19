package org.cdb1.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.landladymag.service.IDealService;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestDeal {

	@Resource
	private IDealService dealServiceImpl;
	@Test
	public void testSaveDeal(){
		
		
		
	}
	
	
}

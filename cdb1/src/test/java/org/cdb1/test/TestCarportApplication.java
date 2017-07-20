package org.cdb1.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.landladymag.service.ICarportApplicationService;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestCarportApplication {

	@Resource
	private ICarportApplicationService carportApplicationServiceImpl;
	@Resource
	private ILandladyService landladyServiceImpl;
	@Ignore
	public void testSaveCarportApplication(){
		LandladyBean land=landladyServiceImpl.getLandladyById(1l);
		CarportApplicationBean c=new CarportApplicationBean();
		c.setCarportAddress("共和村");
		c.setCarportAddressCode("1006");
		c.setCarportEquityCode("说个毛线");
		c.setEquityCopies("没有");
		c.setLandlady(land);
		c.setStatus("未审核");
		carportApplicationServiceImpl.saveCarportApplication(c);
	}
	@Ignore
	public void testgetCarportApplicationById(){
		CarportApplicationBean c=carportApplicationServiceImpl.getCarportApplicationById(1l);
		
		System.out.println(c);
	}
	@Ignore
	public void testDeleteCarportApplicationById(){
		CarportApplicationBean c=carportApplicationServiceImpl.getCarportApplicationById(2l);
		carportApplicationServiceImpl.deleteCarportApplicationById(c);
	}
	@Test
	public void testGetCarportApplicationListByItems(){
		Map map=new HashMap(); 
		map.put("fkLandladyId", 1l);
		
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(2);
		p=carportApplicationServiceImpl.getCarportApplicationListByItems(map, p);
		System.out.println(p);
	}
}

package org.cdb1.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.beans.CarportIssueBean;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.landladymag.service.ICarportApplicationService;
import org.myitems.cdb1.landladymag.service.ICarportIssueService;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestCarportIssue {

	@Resource
	private ILandladyService landladyServiceImpl;
	@Resource
	private ICarportIssueService carportIssueServiceImpl;
	@Resource
	private ICarportApplicationService carportApplicationServiceImpl;
	@Ignore
	public void testSaveCarportIssue(){
		
		Map map=new HashMap();
		map.put("status","mm");
//		map.put("fkLandladyId", 1l);
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		p=carportApplicationServiceImpl.getCarportApplicationListByItems(map, p);
		LandladyBean land=landladyServiceImpl.getLandladyById(1l);
		
		CarportIssueBean c=new CarportIssueBean();
		c.setStartTime("2017-07-01");
		c.setAppBean((CarportApplicationBean)p.getDatas().get(0));
		c.setEndTime("2017-06-01");
		c.setLandlady(land);
		c.setPrice("500元");
		
		c.setStatus("未出租");
		carportIssueServiceImpl.saveCarportIssue(c);
	
	}
	@Ignore
	public void testGetCarportIssueById(){
		CarportIssueBean c=carportIssueServiceImpl.getCarportIssueById(1l);
		System.out.println(c);
	}
	@Ignore
	public void testDeleteCarportIssueById(){
		CarportIssueBean c=carportIssueServiceImpl.getCarportIssueById(2l);
		carportIssueServiceImpl.deleteCarportIssueById(c);
	}
	@Ignore
	public void testGetCarportIssueListByItems(){
		Map map=new HashMap();
		map.put("fkLandladyId", 3l);
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		p=carportIssueServiceImpl.getCarportIssueListByItems(map, p);
		System.out.println(p);
	}
}

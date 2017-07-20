package org.cdb1.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.PredetermineCarportBean;
import org.myitems.cdb1.beans.RobTenantsBean;
import org.myitems.cdb1.landladymag.service.IDealService;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.myitems.cdb1.landladymag.service.IPredetermineCarportService;
import org.myitems.cdb1.landladymag.service.IRobTenantsService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestDeal {

	@Resource
	private IDealService dealServiceImpl;
	@Resource
	private IRobTenantsService robTenantsServiceImpl;
	@Resource
	private ILandladyService landladyServiceImpl;
	@Resource
	private IPredetermineCarportService predetermineCarportServiceImpl;
	
	@Ignore
	public void testSaveDeal(){
		Map map=new HashMap();
		
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		
		p=predetermineCarportServiceImpl.getPredetermineCarportListByItems(map, p);
		
		DealBean deal=new DealBean();
		deal.setStatus("历史记录");
		deal.setCarportIssue(((PredetermineCarportBean)p.getDatas().get(0)).getCarBean());
		deal.setLandlady(((PredetermineCarportBean)p.getDatas().get(0)).getLandlady());
		deal.setRobTenants(((PredetermineCarportBean)p.getDatas().get(0)).getRobBean());
		dealServiceImpl.saveDeal(deal);
		
	}
	@Test
	public void testGet(){
		Map map=new HashMap();
		map.put("fkLandladyId", 2l);
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		
		p=dealServiceImpl.getDealListByItems(map, p);
		System.out.println(p);
	}
}

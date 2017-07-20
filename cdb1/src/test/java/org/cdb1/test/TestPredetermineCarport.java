package org.cdb1.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.CarportIssueBean;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.PredetermineCarportBean;
import org.myitems.cdb1.beans.RobTenantsBean;
import org.myitems.cdb1.landladymag.service.ICarportIssueService;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.myitems.cdb1.landladymag.service.IPredetermineCarportService;
import org.myitems.cdb1.landladymag.service.IRobTenantsService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestPredetermineCarport {

	private static final String PredetermineCarportBean = null;
	@Resource
	private IPredetermineCarportService predetermineCarportServiceImpl;
	@Resource
	private ILandladyService landladyServiceImpl;
	@Resource
	private IRobTenantsService robTenantsServiceImpl;
	@Resource
	private ICarportIssueService carportIssueServiceImpl;
	@Ignore
	public void testSavePredetermineCarport(){
		LandladyBean l=landladyServiceImpl.getLandladyById(1l);
		RobTenantsBean r=robTenantsServiceImpl.getRobTenantsById(1l);
		CarportIssueBean c=carportIssueServiceImpl.getCarportIssueById(1l);
		PredetermineCarportBean p=new PredetermineCarportBean();
		p.setCarBean(c);
		p.setLandlady(l);
		p.setMessage("留给我");
		p.setRobBean(r);
		p.setStatus("待处理");
		predetermineCarportServiceImpl.savePredetermineCarport(p);
	}
	
	@Test
	public void testGetPredetermineCarportListByItems(){
		Map map=new HashMap();
		map.put("fkLandladyId", 1l);
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		p=predetermineCarportServiceImpl.getPredetermineCarportListByItems(map, p);
		System.out.println(p);
	}
	@Ignore
	public void testUpdatePredetermineCarportById(){
		Map map=new HashMap();
		
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		p=predetermineCarportServiceImpl.getPredetermineCarportListByItems(map, p);
		Long id=((PredetermineCarportBean)p.getDatas().get(0)).getId();
		Long fkid=((PredetermineCarportBean)p.getDatas().get(0)).getLandlady().getId();
		predetermineCarportServiceImpl.updatePredetermineCarportById(id, fkid);
	}
	
}

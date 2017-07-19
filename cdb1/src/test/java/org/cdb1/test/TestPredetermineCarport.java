package org.cdb1.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.PredetermineCarportBean;
import org.myitems.cdb1.landladymag.service.IPredetermineCarportService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestPredetermineCarport {

	@Resource
	private IPredetermineCarportService predetermineCarportServiceImpl;

	@Test
	public void testGetPredetermineCarportListByItems(){
		Map map=new HashMap();
		
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		p=predetermineCarportServiceImpl.getPredetermineCarportListByItems(map, p);
		System.out.println(p);
	}

}

package org.cdb1.test;


import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.landladymag.service.IDealService;
import org.myitems.cdb1.landladymag.service.ILandladyComplainService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class testLandladyComplain {

	@Resource
	private IDealService dealServiceImpl;
	@Resource
	private ILandladyComplainService landladyComplainServiceImpl;
	@Ignore
	public void testSave(){
		Map map=new HashMap();
		map.put("fkLandladyId", 2l);
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		
		p=dealServiceImpl.getDealListByItems(map, p);
		System.out.println(p);
		LandladyComplainBean l=new LandladyComplainBean();
		l.setReasons("脑壳有包");
		l.setComplainant(((DealBean)p.getDatas().get(0)).getLandlady().getUserName());
		l.setBeComplaint(((DealBean)p.getDatas().get(0)).getRobTenants().getUserName());
		l.setComplainantDate(Date.valueOf("2017-06-06"));
		l.setDealBean(((DealBean)p.getDatas().get(0)));
		l.setLandlady(((DealBean)p.getDatas().get(0)).getLandlady());
		System.out.println(l);
		landladyComplainServiceImpl.saveLandladyComplain(l);
		
	}
	@Test
	public void testGet(){
		Map map=new HashMap();
		map.put("fkLandladyId", 2l);
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(3);
		
		p=landladyComplainServiceImpl.getLandladyComplainListByItems(map, p);
		System.out.println(((LandladyComplainBean)p.getDatas().get(0)).getDealBean());
	}
}

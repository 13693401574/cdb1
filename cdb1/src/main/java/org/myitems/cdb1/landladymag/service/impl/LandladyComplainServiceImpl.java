package org.myitems.cdb1.landladymag.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.RobTenantsBean;
import org.myitems.cdb1.landladymag.dao.IDealDao;
import org.myitems.cdb1.landladymag.dao.ILandladyComplainDao;
import org.myitems.cdb1.landladymag.service.ILandladyComplainService;
import org.myitems.cdb1.robTenantsmag.dao.IRobTenantsDao;
import org.springframework.stereotype.Service;

@Service
public class LandladyComplainServiceImpl implements ILandladyComplainService {

	@Resource
	private ILandladyComplainDao landladyComplainDaoImpl;
	@Resource
	private IDealDao dealDaoImpl;
	@Resource
	private IRobTenantsDao robTenantsDaoImpl;
	public void saveLandladyComplain(LandladyComplainBean landladyComplain) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		landladyComplainDaoImpl.saveLandladyComplain(landladyComplain);
		dealDaoImpl.updateDealBean(landladyComplain.getDealBean());
		RobTenantsBean rob=landladyComplain.getDealBean().getRobTenants();
		Long id=rob.getId();
		String status="1";
		map.put("fkRobtenantId", rob.getId());
		int count=dealDaoImpl.getCountIdByRobStatusAndRobladyId(status, id)+1;
		System.out.println("我是抢租客被投诉的次数"+count);
		int countLandDeal=dealDaoImpl.getCountDealListByItems(map);
		rob.setCredibility(count+"/"+countLandDeal);
		robTenantsDaoImpl.updateRobTenants(rob);
	}

	public Pager getLandladyComplainListByItems(Map map, Pager page) {
		// TODO Auto-generated method stub
		int tolRows=landladyComplainDaoImpl.getCountLandladyComplainListByItems(map);
		List<LandladyComplainBean> datas=landladyComplainDaoImpl.getLandladyComplainListByItems(map);
		
		page.setTotalRows(tolRows);
		page.setDatas(datas);
		return page;
	}

}

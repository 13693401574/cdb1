package org.myitems.cdb1.robTenantsmag.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.RobTenantsBean;
import org.myitems.cdb1.beans.RobTenantsComplainBean;
import org.myitems.cdb1.landladymag.dao.IDealDao;
import org.myitems.cdb1.landladymag.dao.ILandladyDao;
import org.myitems.cdb1.robTenantsmag.dao.IRobtenantsComplainDao;
import org.myitems.cdb1.robTenantsmag.service.IRobtenantsComplainService;
import org.springframework.stereotype.Service;

@Service
public class RobtenantsComplainServiceImpl implements IRobtenantsComplainService {

	@Resource
	private IRobtenantsComplainDao robtenantsComplainDaoImpl;
	@Resource
	private IDealDao dealDaoImpl;
	@Resource
	private ILandladyDao landladyDaoImpl;
	@Override
	public void saveRobTenantsComplain(RobTenantsComplainBean robTenantsComplain) {
		
		// TODO Auto-generated method stub
		Map map=new HashMap();
		robtenantsComplainDaoImpl.saveRobTenantsComplain(robTenantsComplain);
		dealDaoImpl.updateDealBean(robTenantsComplain.getDealBean());
		LandladyBean land=robTenantsComplain.getDealBean().getLandlady();
		Long id=robTenantsComplain.getDealBean().getLandlady().getId();
		String status="1";
		map.put("fkLandladyId", land.getId());
		int count=dealDaoImpl.getCountIdByStatusAndLandladyId(status, id)+1;
		int countLandDeal=dealDaoImpl.getCountDealListByItems(map);
		land.setCredibility(count+"/"+countLandDeal);
		landladyDaoImpl.updateLandlady(land);
	}

	@Override
	public List<RobTenantsComplainBean> getRobTenantsComplainListByItems(Map map) {
		// TODO Auto-generated method stub
		return robtenantsComplainDaoImpl.getRobTenantsComplainListByItems(map);
	}

}

package org.myitems.cdb1.landladymag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.landladymag.dao.IDealDao;
import org.myitems.cdb1.landladymag.dao.ILandladyComplainDao;
import org.myitems.cdb1.landladymag.service.ILandladyComplainService;
import org.springframework.stereotype.Service;

@Service
public class LandladyComplainServiceImpl implements ILandladyComplainService {

	@Resource
	private ILandladyComplainDao landladyComplainDaoImpl;
	@Resource
	private IDealDao dealDaoImpl;
	
	public void saveLandladyComplain(LandladyComplainBean landladyComplain) {
		// TODO Auto-generated method stub
		landladyComplainDaoImpl.saveLandladyComplain(landladyComplain);
		
		dealDaoImpl.updateDealBean(landladyComplain.getDealBean());
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

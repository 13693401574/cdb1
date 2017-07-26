package org.myitems.cdb1.usermag.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.usermag.dao.ILanlayComplaninDao;
import org.myitems.cdb1.usermag.service.ILandlayComplainService;
import org.springframework.stereotype.Service;
/*
 * 受理包租婆的投诉
 */
@Service
public class LandlayComplainServiceImpl implements ILandlayComplainService{
	@Resource
	private ILanlayComplaninDao landlayComplainDaoImpl;
	
	@Override
	public LandladyComplainBean getLandlayCompliainInfo(Long id) {
		// TODO Auto-generated method stub
		System.out.println(id+"========================");
		return landlayComplainDaoImpl.getLandlayCompliainInfo(id);
	}

	@Override
	public void RobTenanStatus(String status,Long id) {
		// TODO Auto-generated method stub
		landlayComplainDaoImpl.RobTenanStatus(status, id);
	}

	@Override
	public ComplainBean getDealInfo(Long id) {
		// TODO Auto-generated method stub
		return landlayComplainDaoImpl.getDealInfo(id);
	}

	
	


}

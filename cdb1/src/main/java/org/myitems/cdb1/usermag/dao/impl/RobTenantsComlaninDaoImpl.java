package org.myitems.cdb1.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.RobTenantsComplainBean;
import org.myitems.cdb1.landladymag.dao.ILandladyComplainDao;
import org.myitems.cdb1.usermag.dao.IRobTenantsComlaninDao;
import org.myitems.cdb1.usermag.mapper.IRobTeantsComplainMapper;
import org.springframework.stereotype.Repository;


@Repository
public class RobTenantsComlaninDaoImpl implements IRobTenantsComlaninDao {

	@Resource
	private IRobTeantsComplainMapper rm;

	@Override
	public ComplainBean getRobTenantsComplainInfo(Long id) {
		// TODO Auto-generated method stub
		return rm.getLandlayCompliainInfo(id);
	}

	@Override
	public void landlayStatus(String status, Long id) {
		// TODO Auto-generated method stub
		rm.updateLandlayCompliain(status, id);
	}

	@Override
	public List<RobTenantsComplainBean> findAll() {
		// TODO Auto-generated method stub
		return  rm.findAll();
	}

	
}

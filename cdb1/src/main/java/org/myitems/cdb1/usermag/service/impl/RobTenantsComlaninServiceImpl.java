package org.myitems.cdb1.usermag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.RobTenantsComplainBean;
import org.myitems.cdb1.usermag.dao.IRobTenantsComlaninDao;
import org.myitems.cdb1.usermag.service.IRobTenantsComlaninService;
import org.springframework.stereotype.Service;
@Service
public class RobTenantsComlaninServiceImpl implements IRobTenantsComlaninService {

	@Resource
	private  IRobTenantsComlaninDao robTenantsComlaninDaoImpl;
	
	@Override
	public ComplainBean getRobTenantsComplainInfo(Long id) {
		// TODO Auto-generated method stub
		return robTenantsComlaninDaoImpl.getRobTenantsComplainInfo(id);
	}

	@Override
	public void landlayStatus(String status, Long id) {
		// TODO Auto-generated method stub
		robTenantsComlaninDaoImpl.landlayStatus(status, id);
	}

	@Override
	public List<RobTenantsComplainBean> findAll() {
		// TODO Auto-generated method stub
		return robTenantsComlaninDaoImpl.findAll();
	}

}

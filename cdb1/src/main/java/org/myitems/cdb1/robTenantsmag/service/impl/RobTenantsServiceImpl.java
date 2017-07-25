package org.myitems.cdb1.robTenantsmag.service.impl;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.RobTenantsBean;
import org.myitems.cdb1.robTenantsmag.dao.IRobTenantsDao;
import org.myitems.cdb1.robTenantsmag.service.IRobTenantsService;
import org.springframework.stereotype.Service;

@Service
public class RobTenantsServiceImpl implements IRobTenantsService {

	@Resource
	IRobTenantsDao robTenantsDaoImpl;
	
	@Override
	public void saveRobTenants(RobTenantsBean robTenants) {
		// TODO Auto-generated method stub
		robTenantsDaoImpl.saveRobTenants(robTenants);
	}

	@Override
	public RobTenantsBean getRobTenantsById(Long id) {
		// TODO Auto-generated method stub
		return robTenantsDaoImpl.getRobTenantsById(id);
	}

	@Override
	public void updateRobTenants(RobTenantsBean robTenants) {
		// TODO Auto-generated method stub
		robTenantsDaoImpl.updateRobTenants(robTenants);
	}

}

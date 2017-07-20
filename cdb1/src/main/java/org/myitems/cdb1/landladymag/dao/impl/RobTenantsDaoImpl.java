package org.myitems.cdb1.landladymag.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.RobTenantsBean;
import org.myitems.cdb1.landladymag.dao.IRobTenantsDao;
import org.myitems.cdb1.landladymag.mapper.RobTenantsMapper;
import org.springframework.stereotype.Repository;
@Repository
public class RobTenantsDaoImpl implements IRobTenantsDao {

	@Resource
	private SessionFactory sf;
	@Resource
	private RobTenantsMapper rtm;
	
	@Override
	public void saveRobTenants(RobTenantsBean robTenants) {
		// TODO Auto-generated method stub
		sf.openSession().save(robTenants);
	}

	@Override
	public RobTenantsBean getRobTenantsById(Long id) {
		// TODO Auto-generated method stub
		return rtm.getRobTenantsById(id);
	}

	@Override
	public void updateRobTenants(RobTenantsBean robTenants) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(robTenants);
	}

}

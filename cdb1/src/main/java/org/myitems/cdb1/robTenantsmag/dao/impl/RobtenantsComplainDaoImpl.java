package org.myitems.cdb1.robTenantsmag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.RobTenantsComplainBean;
import org.myitems.cdb1.robTenantsmag.dao.IRobtenantsComplainDao;
import org.myitems.cdb1.robTenantsmag.mapper.RobtenantsComplainMapper;
import org.springframework.stereotype.Repository;
@Repository
public class RobtenantsComplainDaoImpl implements IRobtenantsComplainDao {

	@Resource
	private SessionFactory sf;
	private RobtenantsComplainMapper rcm;
	
	@Override
	public void saveRobTenantsComplain(RobTenantsComplainBean robTenantsComplain) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(robTenantsComplain);
	}

	@Override
	public List<RobTenantsComplainBean> getRobTenantsComplainListByItems(Map map) {
		// TODO Auto-generated method stub
		return rcm.getRobTenantsComplainListByItems(map);
	}

}

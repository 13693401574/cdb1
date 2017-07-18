package org.myitems.cdb1.companymag.dao.impl;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CompanyUserBean;
import org.myitems.cdb1.companymag.dao.ICompanyUserDao;
import org.myitems.cdb1.companymag.mapper.CompanyUserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyUserDaoImpl implements ICompanyUserDao {
	
	private CompanyUserMapper cm;

	@Override
	public int countCompanyAlreadyRentCarportNumByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return cm.countCompanyAlreadyRentCarportNumByMapToPager(map);
	}

	@Override
	public List<?> findCompanyAlreadyRentCarportListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return cm.findCompanyAlreadyRentCarportListByMapToPager(map);
	}

	@Override
	public int countCompanyCanRentFreeCarportByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<?> findCompanyConRentCarpotListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCompanyUserInfo(CompanyUserBean companyUser) {
		// TODO Auto-generated method stub
		return 0;
	}

}

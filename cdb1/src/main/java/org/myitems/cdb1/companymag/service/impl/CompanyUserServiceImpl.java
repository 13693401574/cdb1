package org.myitems.cdb1.companymag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.CompanyUserBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.companymag.dao.ICompanyUserDao;
import org.myitems.cdb1.companymag.service.ICompanyUserService;
import org.springframework.stereotype.Service;

@Service
public class CompanyUserServiceImpl implements ICompanyUserService {

	@Resource
	private ICompanyUserDao companyUserDaoImpl;
	
	@Override
	public Pager getAlreadyRentCarportByMapToPager(Map map, Pager pager) {
		int totalRows = companyUserDaoImpl.countCompanyAlreadyRentCarportNumByMapToPager(map);
		List<?> datas = companyUserDaoImpl.findCompanyAlreadyRentCarportListByMapToPager(map);
		pager.setTotalRows(totalRows);
		pager.setDatas(datas);
		return pager;
	}

	@Override
	public Pager getCanRentFreeCarportByMapToPager(Map map, Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCompanyUserInfo(CompanyUserBean companyUser) {
		// TODO Auto-generated method stub
		return companyUserDaoImpl.updateCompanyUserInfo(companyUser);
	}

}

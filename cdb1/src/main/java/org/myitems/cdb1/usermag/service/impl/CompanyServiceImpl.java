package org.myitems.cdb1.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.CompanyUserBean;
import org.myitems.cdb1.usermag.dao.ICompanyDao;
import org.myitems.cdb1.usermag.service.ICompanyService;
import org.springframework.stereotype.Service;
@Service
public class CompanyServiceImpl implements ICompanyService{
	
	
	@Resource
	private ICompanyDao companyDaoImpl;
	
	@Override
	public long addCompanyUser(CompanyUserBean companyUser) {
		// TODO Auto-generated method stub
		Long rows=companyDaoImpl.addCompanyUser(companyUser);
		return rows;
	}

	@Override
	public int deleteCompanyUser(CompanyUserBean companyUser) {
		// TODO Auto-generated method stub
		 int rows=companyDaoImpl.deleteCompanyUser(companyUser);
		return rows;
	}

	@Override
	public CompanyUserBean selectCompanyUser(Long id) {
		// TODO Auto-generated method stub
		return companyDaoImpl.selectCompanyUser(id);
	}

	@Override
	public List<CompanyUserBean> findCompanyUser(Map map) {
		// TODO Auto-generated method stub
		return companyDaoImpl.findCompanyUser(map);
	}

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		return companyDaoImpl.findCount();
	}

}

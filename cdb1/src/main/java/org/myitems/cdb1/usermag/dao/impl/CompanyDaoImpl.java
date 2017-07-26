package org.myitems.cdb1.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.CompanyUserBean;
import org.myitems.cdb1.usermag.dao.ICompanyDao;
import org.myitems.cdb1.usermag.mapper.CompanyMapper;
import org.springframework.stereotype.Repository;
/**
 * 企业用户持久类
 * @author Administrator
 *
 */
@Repository
public class CompanyDaoImpl implements ICompanyDao{
	
	@Resource
	private SessionFactory sf;
	@Resource
	private CompanyMapper cm;
	
	
	/**
	 * 增加一个企业用户
	 */
	@Override
	public long addCompanyUser(CompanyUserBean companyUser) {
		// TODO Auto-generated method stub
		return (Long) sf.getCurrentSession().save(companyUser);
	}
	/**
	 * 删除一个用户
	 */
	@Override
	public int deleteCompanyUser(CompanyUserBean companyUser) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(companyUser);
		return 1;
	}
	/**
	 * 查询一个用户
	 */
	@Override
	public CompanyUserBean selectCompanyUser(Long id) {
		// TODO Auto-generated method stub
		return (CompanyUserBean) sf.getCurrentSession().get(CompanyUserBean.class, id);
	}
	/**
	 * 模糊查询一个用户
	 */
	@Override
	public List<CompanyUserBean> findCompanyUser(Map map) {
		// TODO Auto-generated method stub
		return cm.findCompanyUser(map) ;
	}
	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		return cm.findCount();
	}

}

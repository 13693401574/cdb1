package org.myitems.cdb1.usermag.service;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CompanyUserBean;

/**
 * 企业用户管理模块 
 * @author Administrator
 *
 */
public interface ICompanyService {
	/**
	 * 添加一个企业用户
	 * @param companyUser 企业用户实体类
	 * 
	 */
	public long addCompanyUser(CompanyUserBean companyUser);
	
	/**
	 * 删除一个企业用户
	 * @param id 企业用户id
	 * 
	 */
	public int deleteCompanyUser(CompanyUserBean companyUser);
	/**
	 * 查看一个企业用户
	 * @param id 企业用户的id
	 * @return 企业用户
	 */
	public CompanyUserBean selectCompanyUser(Long id);
	/**
	 * 模糊查询一个企业用户
	 * @param map 用户输入的参数
	 * @return 企业用户对象
	 */
	public List<CompanyUserBean> findCompanyUser(Map map);
	/**
	 * 得到总数据
	 * @return
	 */
	public int findCount();
	
}

package org.myitems.cdb1.companymag.service;

import java.util.Map;

import org.myitems.cdb1.beans.CompanyUserBean;
import org.myitems.cdb1.beans.Pager;
/**
 *企业管理业务层接口
 * @author Administrator
 *
 */
public interface ICompanyUserService {
	
	/**获取已租车位的分页对象*/
	public Pager getAlreadyRentCarportByMapToPager(Map map,Pager pager);
	
	/**获取可租车位的分页对象*/
	public Pager getCanRentFreeCarportByMapToPager(Map map,Pager pager);
	
	/**企业用户修改个人信息*/
	public int updateCompanyUserInfo(CompanyUserBean companyUser);
}

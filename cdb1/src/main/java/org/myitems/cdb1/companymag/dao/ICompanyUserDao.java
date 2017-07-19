package org.myitems.cdb1.companymag.dao;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CompanyUserBean;
/**
 * 企业用户功能模块 持久层接口
 * @author Administrator
 *
 */
public interface ICompanyUserDao {
	/**
	 * 统计企业已租车位总条数
	 * @param map 查询条件
	 * @return 总条数
	 */
	public int countCompanyAlreadyRentCarportNumByMapToPager(Map map);
	
	/**
	 * 查询企业已租车位具体信息
	 * @param map 查询条件，包含了从第几页开始查，和每页显示多少条
	 * @return  企业已租车位信息集合
	 */
	public List<?> findCompanyAlreadyRentCarportListByMapToPager(Map map);
	
	/**
	 * 统计企业可租车位总条数
	 * @param map 查询条件
	 * @return 总条数
	 */
	public int countCompanyCanRentFreeCarportByMapToPager(Map map);
	
	/**
	 * 查询企业可租车位具体信息
	 * @param map 查询条件，包含了从第几页查，和每页显示多少条
	 * @return  企业可租车位信息集合
	 */
	public List<?> findCompanyConRentCarpotListByMapToPager(Map map);
	
	/**
	 * 企业用户修改个人信息
	 * @param companyUser 企业用户对象
	 * @return 改变的行数
	 */
	public int updateCompanyUserInfo(CompanyUserBean companyUser);
	

}

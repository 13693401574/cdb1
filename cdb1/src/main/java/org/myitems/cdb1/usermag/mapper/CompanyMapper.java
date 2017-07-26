package org.myitems.cdb1.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.myitems.cdb1.beans.CompanyUserBean;

public interface CompanyMapper {
	/**
	 * 模糊查询一个企业用户
	 * @param map 参数
	 * @return 企业用户
	 */
	public List<CompanyUserBean> findCompanyUser(@Param("map")Map map);
	
	/**
	 * 得到总数据
	 * @return
	 */
	public int findCount();
	
	
	
}

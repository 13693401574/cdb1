package org.myitems.cdb1.companymag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CompanyUserMapper {
	/**
	 * 统计企业已租车位总条数
	 * @param map 查询条件
	 * @return 总条数
	 */
	public int countCompanyAlreadyRentCarportNumByMapToPager(@Param("map")Map map);
	
	/**
	 * 查询企业已租车位具体信息
	 * @param map 查询条件，包含了从第几页开始查，和每页显示多少条
	 * @return  企业已租车位信息集合
	 */
	public List<?> findCompanyAlreadyRentCarportListByMapToPager(@Param("map")Map map);
	
	/**
	 * 统计企业可租车位总条数
	 * @param map 查询条件
	 * @return 总条数
	 */
	public int countCompanyCanRentFreeCarportByMapToPager(@Param("map")Map map);
	
	/**
	 * 查询企业可租车位具体信息
	 * @param map 查询条件，包含了从第几页查，和每页显示多少条
	 * @return  企业可租车位信息集合
	 */
	public List<?> findCompanyConRentCarpotListByMapToPager(@Param("map")Map map);
	

}

package org.myitems.cdb1.landladymag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.myitems.cdb1.beans.DealBean;

public interface DealMapper {
	/**
	 * 根据条件动态查询包租婆历史记录的总条数
	 * @param map
	 * @return
	 */
	public int getCountDealListByItems(@Param("map")Map map);
	/**
	 * 根据条件动态查询包租婆历史记录
	 * @param map
	 * @return
	 */
	public List<DealBean> getDealListByItems(@Param("map")Map map);
	
	
	
	public DealBean getDealById(@Param("id")Long id);
}

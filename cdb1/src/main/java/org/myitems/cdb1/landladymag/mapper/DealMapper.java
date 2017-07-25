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
	
	/**
	 * 根据包租婆id和被投诉状态查询包租婆被投诉的次数
	 * @param status
	 * @return
	 */
	@Select("select count(id) from t_deal where fkLandladyId=#{id} and status=#{status}")
	public int getCountIdByStatusAndLandladyId(@Param("status")String status,@Param("id")Long id);
	
	/**
	 * 根据抢租客id和被投诉状态查询包租婆被投诉的次数
	 * @param status
	 * @return
	 */
	@Select("select count(id) from t_deal where fkRobManId=#{id} and robStatus=#{status}")
	public int getCountIdByRobStatusAndRobladyId(@Param("status")String status,@Param("id")Long id);
}

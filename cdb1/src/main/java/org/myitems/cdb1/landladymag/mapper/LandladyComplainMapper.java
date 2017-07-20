package org.myitems.cdb1.landladymag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.myitems.cdb1.beans.LandladyComplainBean;

public interface LandladyComplainMapper {

	/**
	 * 根据条件动态查询包租婆投诉的总条数
	 * @param map
	 * @return
	 */
	public int getCountLandladyComplainListByItems(@Param("map")Map map);
	/**
	 * 根据条件动态查询包租婆投诉信息
	 * @param map
	 * @return
	 */
	public List<LandladyComplainBean> getLandladyComplainListByItems(@Param("map")Map map);
}

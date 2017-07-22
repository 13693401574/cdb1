package org.myitems.cdb1.landladymag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.myitems.cdb1.beans.CarportApplicationBean;

public interface CarportApplicationMapper {

	
	/**
	 * 根据车位申请Id查看车位申请的详细信息
	 * @param id
	 * @return
	 */

	public CarportApplicationBean getCarportApplicationById(@Param("id")Long id);
	/**
	 * 根据条件动态查询车位申请的总条数
	 * @param map
	 * @return
	 */
	
	public int getCountCarportApplicationByItems(@Param("map")Map map);
	/**
	 * 根据条件动态查询车位申请
	 * @param map
	 * @return
	 */
	public List<CarportApplicationBean> getCarportApplicationListByItems(@Param("map")Map map);

	/**
	 * 根据包租婆的Id查询车位所在小区
	 * @param fkLandladyId
	 * @return
	 */
	@Select("select DISTINCT carportAddress from t_carportapplication where fkLandladyId=#{fkLandladyId} and status='审核通过'")
	public List<String> getCarportAddressNameByFkLandladyId(@Param("fkLandladyId")Long fkLandladyId);
}

package org.myitems.cdb1.landladymag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.myitems.cdb1.beans.CarportApplicationBean;

public interface CarportApplicationMapper {

	
	/**
	 * 根据车位申请Id查看车位申请的详细信息
	 * @param id
	 * @return
	 */
	@ResultType(CarportApplicationBean.class)
	@Select("select * from t_carportApplication where id=#{id}")
	public CarportApplicationBean getCarportApplicationById(@Param("id")Long id);
	/**
	 * 根据条件动态查询车位申请的总条数
	 * @param map
	 * @return
	 */
	@Select("select count(id) from t_carportApplication where #{map.id} ")
	public int getCountCarportApplicationByItems(@Param("map")Map map);
	/**
	 * 根据条件动态查询车位申请
	 * @param map
	 * @return
	 */
	public List<CarportApplicationBean> getCarportApplicationListByItems(Map map);
}

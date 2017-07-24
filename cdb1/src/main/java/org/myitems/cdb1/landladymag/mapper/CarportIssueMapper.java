package org.myitems.cdb1.landladymag.mapper;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.beans.CarportIssueBean;

public interface CarportIssueMapper {
	/**
	 * 根据发出招租车位信息Id查询招租车位信息
	 * @param id
	 * @return
	 */
	
	@Select("select * from t_carportIssue where id=#{id}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="startTime",column="startTime",javaType=Date.class),
		@Result(property="endTime",column="endTime",javaType=Date.class),
		@Result(property="price",column="price",javaType=String.class),
		@Result(property="status",column="status",javaType=String.class),
		@Result(property="appBean",javaType=CarportApplicationBean.class,column="fkCarportApplicationId", one=@One(select="org.myitems.cdb1.landladymag.mapper.CarportApplicationMapper.getCarportApplicationById"))
	})
	public CarportIssueBean getCarportIssueById(@Param("id")Long id);
	
	/**
	 * 根据条件动态查询包租婆发布招租车位信息的总条数
	 * @param map
	 * @return
	 */
	public int getCountCarportIssueListByItems(@Param("map")Map map);
	/**
	 * 根据条件动态查询包租婆发布招租车位信息
	 * @param map
	 * @return
	 */
	public List<CarportIssueBean> getCarportIssueListByItems(@Param("map")Map map);
}

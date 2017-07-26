package org.myitems.cdb1.usermag.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.beans.LandladyBean;



public interface ILandlayMapper {
	/**
	 * 这里是一个车位申请对应一包租婆用户的信息（这里不要与一个包租可以有多个申请车位混淆）
	 * 所有用的是one@One
	 * mybaties一对多的思路是先查询在少的方中查询中调用查询多的方的对象
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="carportEquityCode",column="carportEquityCode",javaType=String.class),
		@Result(property="carportAddress",column="carportAddress",javaType=String.class),
		@Result(property="carportAddressCode",column="carportAddressCode",javaType=String.class),
		@Result(property="equityCopies",column="equityCopies",javaType=String.class),
		@Result(property="status",column="status",javaType=String.class),
		@Result(property="landlady",javaType=LandladyBean.class,column="fkLandladyId",one=@One(select="selectLandlady"))			
	})
	@Select("select * from t_carportapplication as car where car.id=#{id} ")
	public CarportApplicationBean selectLandlayCarportInfo(@Param("id")Long id);
	
	@ResultType(LandladyBean.class)
	@Select("select * from t_landlady as lan where id=#{id}")
	public LandladyBean selectLandlady(@Param("id")Long id);
	
	/**
	 * 查询出当前受理的申请车位的对象
	 * @param id 申请车位的id
	 * @return 申请车位对象
	 */
	
	@Select("update t_carportapplication as car set car.status=#{status} where car.id=#{id}")
	public void updateCarportApplicationBeanStatus(@Param("status")String status,@Param("id")Long id);


	public List<?> findAll(@Param("map") Map map);
	
 
	
	
}

package org.myitems.cdb1.usermag.mapper;

import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.myitems.cdb1.beans.CarportIssueBean;
import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.RobTenantsBean;
import org.apache.ibatis.annotations.Results;

public interface ILandlayComplainMapper {
	
	

	@ResultType(ComplainBean.class)
	@Select("SELECT complain.complainant AS complainant,complain.beComplaint AS beComplaint,complain.reasons AS reasons ,rob.userName AS BuserName,rob.realName AS BrealName,rob.phnoe AS Bphone,rob.idCard AS BidCard,rob.jobDescribe AS BjobDescribe,land.userName AS TuserName,land.realName AS TrealName,land.phone AS Tphone,land.idCard AS TidCard,land.jobDescribe AS TjobDescribe,carapp.carportAddress AS carportAddress,carapp.carportAddressCode AS carportAddressCode,car.startTime AS startTime,car.endTime AS endTime "
			+ " FROM t_landladycomplain AS complain ,t_landladydeal AS deal,t_landlady AS land,t_robtenants AS rob,t_carportissue AS car,t_carportapplication AS carapp"
			+ " WHERE complain.fkLandladyDealId=deal.id"
			+ " AND deal.fkLandladyId=land.id"
			+ " AND deal.fkCarportIssue=car.id "
			+ " AND deal.fkRobManId=rob.id "
			+ " AND car.fkCarportApplicationId=carapp.id "
			+ " AND complain.id=#{id}")
	public ComplainBean getLandlayCompliainInfo(@Param("id") Long id);
	
	
	/**
	 * 受理后的状态
	 */
	@Update("update t_landladycomplain as land set land.status=#{status} where land.id=#{id}")
	public void updateLandlayCompliain(@Param("status")String status,@Param("id") Long id);
	
	
	//第一种写法 一层一层的调用(麻烦)
/*	*//**
	 * 同投诉id 查询出投诉的详细信息
	 * @param id 投诉方的id
	 * @return 投诉的详细信息
	 *//*
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="complainant",column="complainant",javaType=String.class),
		@Result(property="beComplaint",column="beComplaint",javaType=String.class),
		@Result(property="complainantDate",column="complainantDate",javaType=String.class),
		@Result(property="status",column="status",javaType=String.class),
		@Result(property="reasons",column="reasons",javaType=String.class),
		@Result(property="dealBean",javaType=DealBean.class,column="fkLandladyDealId",one=@One(select="getDealBeanById"))
	})
	@Select("select * from t_landladycomplain as land where land.id=#{id}")
	public LandladyComplainBean getLandlayCompliainInfo(@Param("id") Long id);
	
	*//**
	 * 根据id查询历史记录
	 *//*

	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="status",column="status",javaType=String.class),
		@Result(property="landlady",javaType=LandladyBean.class,column="fkLandladyId",one=@One(select="getLandladyById")),
		@Result(property="robTenants",javaType=RobTenantsBean.class, column="fkRobManId",one=@One(select="getRobTeantsById")),
		@Result(property="carportIssue",javaType=CarportIssueBean.class,column="fkCarportIssue",one=@One(select="getCarportIssueById"))
	})
	
	@ResultType(DealBean.class)
	@Select("select * from t_landladydeal where id=#{id}")	
	public DealBean getDealBeanById(@Param("id") Long id);

	*//**
	 * 更据id查询包租婆
	 *//*
	@ResultType(LandladyBean.class)
	@Select("select * from 	t_landlady where id=#{id}")
	public LandladyBean getLandladyById(@Param("id") Long id);
	*//**
	 * 更据id查询抢租客
	 * @param id
	 * @return
	 *//*
	@ResultType(RobTenantsBean.class)
	@Select("select * from 	t_robtenants where id=#{id}")
	public RobTenantsBean getRobTeantsById(@Param("id") Long id); 
	
	*//**
	 * 更据id查询车辆发布信息
	 * @param id
	 * @return
	 *//*
	@ResultType(CarportIssueBean.class)
	@Select("select * from 	t_carportissue where id=#{id}")
	public CarportIssueBean getCarportIssueById(@Param("id") Long id);*/
	
	
	
}

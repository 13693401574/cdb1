package org.myitems.cdb1.usermag.mapper;

import java.util.List;

import javax.xml.crypto.Data;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.RobTenantsComplainBean;

public interface IRobTeantsComplainMapper {

	/**
	 * 显示所有
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="complainant",column="complainant",javaType=String.class),
		@Result(property="beComplaint",column="beComplaint",javaType=String.class),
		@Result(property="complainantDate",column="complainantDate",javaType=String.class),
		@Result(property="status",column="status",javaType=String.class),
		@Result(property="reasons",column="reasons",javaType=String.class)
	})
	@Select("SELECT rob.id AS id ,rob.complainant AS complainant ,rob.beComplaint AS beComplaint ,rob.complainantDate AS complainantDate ,rob.STATUS AS STATUS ,rob.reasons AS reasons  FROM t_robtenantscomplain AS rob ")
	public List<RobTenantsComplainBean>  findAll();
	
	
	/**
	 * 更据id查找
	 * @param id
	 * @return
	 */
	@ResultType(ComplainBean.class)
	@Select("SELECT complain.complainant AS complainant,complain.beComplaint AS beComplaint,complain.reasons AS reasons ,"
			+ " rob.userName AS TuserName,rob.realName AS TrealName,rob.phnoe AS Tphone,rob.idCard AS TidCard,rob.jobDescribe AS TjobDescribe,land.userName AS BuserName,land.realName AS BrealName,land.phone AS Bphone,land.idCard AS BidCard,land.jobDescribe AS BjobDescribe,carapp.carportAddress AS carportAddress,carapp.carportEquityCode AS carportEquityCode,car.startTime AS startTime,car.endTime AS endTime "
			+ " FROM t_robtenantscomplain AS complain ,t_landladydeal AS deal,t_landlady AS land,t_robtenants AS rob,t_carportissue AS car,t_carportapplication AS carapp"
			+ " WHERE complain.fkRobTenantsDealId=deal.id"
			+ " AND deal.fkLandladyId=land.id"
			+ " AND deal.fkCarportIssue=car.id "
			+ " AND deal.fkRobManId=rob.id "
			+ " AND car.fkCarportApplicationId=carapp.id "
			+ " AND complain.id=#{id} AND carapp.status='通过 ' ")
	public ComplainBean getLandlayCompliainInfo(@Param("id") Long id);
	
	
	/**
	 * 受理后的状态
	 */
	@Update("update t_robTenantsComplain as land set land.status=#{status} where land.id=#{id}")
	public void updateLandlayCompliain(@Param("status")String status,@Param("id") Long id);
	
}

package org.myitems.cdb1.landladymag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.myitems.cdb1.beans.CarportIssueBean;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.PredetermineCarportBean;
import org.myitems.cdb1.beans.RobTenantsBean;

public interface PredetermineCarportMapper {

	/**
	 * 根据预约信息修改预约信息的状态
	 * @param id
	 * @return
	 */
	@Update("update t_predetermineCarport set status='同意' where id=#{id}")
	public int updatePredetermineCarportById(@Param("id")Long id);
	@Update("update t_predetermineCarport set status='拒绝' where fkCorportIssueId=#{fkCorportIssueId}")
	public int updatePredetermineCarportByFkCorportIssueId(@Param("fkCorportIssueId")Long fkCorportIssueId);
	
	/**
	 * 根据预约信息ID查询预约信息
	 * @param id
	 * @return
	 */
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="message",column="message",javaType=String.class),
		@Result(property="status",column="status",javaType=String.class),
		@Result(property="robBean",column="fkRobtenantId",javaType=RobTenantsBean.class,one=@One(select="org.myitems.cdb1.landladymag.mapper.RobTenantsMapper.getRobTenantsById")),
		@Result(property="landlady",column="fkLandladyId",javaType=LandladyBean.class,one=@One(select="org.myitems.cdb1.landladymag.mapper.LandladyMapper.getLandladyById")),
		@Result(property="carBean",column="fkCorportIssueId",javaType=CarportIssueBean.class,one=@One(select="org.myitems.cdb1.landladymag.mapper.CarportIssueMapper.getCarportIssueById"))
	})
	@Select("select * from t_predetermineCarport where id=#{id}")
	public PredetermineCarportBean getPredetermineCarportById(@Param("id")Long id);
	
	/**
	 * 根据条件动态查询包租婆车位预约信息总条数
	 * @param map
	 * @return
	 */
	public int getCountPredetermineCarportListByItems(@Param("map")Map map);
	/**
	 * 根据条件动态查询包租婆车位预约信息
	 * @param map
	 * @return
	 */
	public List<PredetermineCarportBean> getPredetermineCarportListByItems(@Param("map")Map map);
}

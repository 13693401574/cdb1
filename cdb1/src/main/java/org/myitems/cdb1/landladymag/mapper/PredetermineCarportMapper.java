package org.myitems.cdb1.landladymag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.myitems.cdb1.beans.PredetermineCarportBean;

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

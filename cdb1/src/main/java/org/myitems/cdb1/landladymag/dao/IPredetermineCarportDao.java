package org.myitems.cdb1.landladymag.dao;

import java.util.List;
import java.util.Map;


import org.myitems.cdb1.beans.PredetermineCarportBean;

/**
 * 包租婆预约信息的持久层接口
 * @author Administrator
 *
 */
public interface IPredetermineCarportDao {

	/**
	 * 添加预约信息
	 * @param predetermineCarport
	 */
	public void savePredetermineCarport(PredetermineCarportBean predetermineCarport);
	
	/**
	 * 根据预约信息ID查询预约信息
	 * @param id
	 * @return
	 */
	public PredetermineCarportBean getPredetermineCarportById(Long id);
	
	/**
	 * 根据预约信息修改预约信息的状态
	 * @param id
	 * @return
	 */
	public int updatePredetermineCarportById(Long id);
	/**
	 * 根据车位发布信息的id修改车位预约信息的状态
	 * @param fkCorportIssueId
	 * @return
	 */
	public int updatePredetermineCarportByFkCorportIssueId(Long fkCorportIssueId);
	/**
	 * 根据条件动态查询包租婆车位预约信息总条数
	 * @param map
	 * @return
	 */
	public int getCountPredetermineCarportListByItems(Map map);
	/**
	 * 根据条件动态查询包租婆车位预约信息
	 * @param map
	 * @return
	 */
	public List<PredetermineCarportBean> getPredetermineCarportListByItems(Map map);
}

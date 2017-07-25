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
	 * 根据预约信息修改预约信息的状态
	 * @param id
	 * @return
	 */
	public int updatePredetermineCarportById(Long id);
	
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

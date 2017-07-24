package org.myitems.cdb1.landladymag.dao;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.DealBean;

/**
 * 包租婆历史记录持久层接口
 * @author Administrator
 *
 */
public interface IDealDao {

	/**
	 * 新增包租婆历史记录
	 * @param deal
	 */
	public void saveDeal(DealBean deal);
	/**
	 * 根据条件动态查询包租婆历史记录的总条数
	 * @param map
	 * @return
	 */
	public int getCountDealListByItems(Map map);
	/**
	 * 根据条件动态查询包租婆历史记录
	 * @param map
	 * @return
	 */
	public List<DealBean> getDealListByItems(Map map);
	
	/**
	 * 根据历史记录Id查询历史记录信息并显示关联表信息
	 * @param id
	 * @return
	 */
	public DealBean getDealById(Long id);
	
	/**
	 * 修改历史记录的状态
	 * @param deal
	 */
	public void updateDealBean(DealBean deal);
}

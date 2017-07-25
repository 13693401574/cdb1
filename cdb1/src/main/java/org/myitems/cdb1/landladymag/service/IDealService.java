package org.myitems.cdb1.landladymag.service;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.Pager;

/**
 * 包租婆历史记录
 * @author Administrator
 *
 */
public interface IDealService {

	/**
	 * 新增包租婆历史记录
	 * @param deal
	 */
	public void saveDeal(DealBean deal);
	/**
	 * 根据条件动态分页查询包租婆的历史成交记录
	 * @param map
	 * @param page
	 * @return
	 */
	public Pager getDealListByItems(Map map,Pager page);
}

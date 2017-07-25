package org.myitems.cdb1.landladymag.service;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.PredetermineCarportBean;

/**
 * 包租婆对于预约信息的处理的业务层接口
 * @author Administrator
 *
 */



public interface IPredetermineCarportService {

	/**
	 * 根据预约信息修改预约信息的状态
	 * @param id
	 * @return
	 */
	public int updatePredetermineCarportById(Long id);
	/**
	 * 根据条件动态分页查询预约记录
	 * @param map
	 * @param page
	 * @return
	 */
	public Pager getPredetermineCarportListByItems(Map map,Pager page);
}

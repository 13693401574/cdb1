package org.myitems.cdb1.landladymag.service;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.Pager;
/**
 * 包租婆投诉的业务层接口
 * @author Administrator
 *
 */
public interface ILandladyComplainService {
	/**
	 * 新增包租婆投诉
	 * @param landladyComplain
	 */
	public void saveLandladyComplain(LandladyComplainBean landladyComplain);

	/**
	 * 根据条件动态查询包租婆的投诉信息
	 * @param map
	 * @param page
	 * @return
	 */
	public Pager getLandladyComplainListByItems(Map map,Pager page);
}

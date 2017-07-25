package org.myitems.cdb1.landladymag.dao;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.LandladyComplainBean;

/**
 * 包租婆投诉的持久层接口
 * @author Administrator
 *
 */
public interface ILandladyComplainDao {

	/**
	 * 新增包租婆投诉
	 * @param landladyComplain
	 */
	public void saveLandladyComplain(LandladyComplainBean landladyComplain);
	
	/**
	 * 根据条件动态查询包租婆投诉的总条数
	 * @param map
	 * @return
	 */
	public int getCountLandladyComplainListByItems(Map map);
	/**
	 * 根据条件动态查询包租婆投诉信息
	 * @param map
	 * @return
	 */
	public List<LandladyComplainBean> getLandladyComplainListByItems(Map map);
}

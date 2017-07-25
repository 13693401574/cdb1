package org.myitems.cdb1.robTenantsmag.dao;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.RobTenantsComplainBean;
/**
 * 抢租客持久层接口
 * @author Administrator
 *
 */
public interface IRobtenantsComplainDao {

	/**
	 * 新增抢租客投诉
	 * @param landladyComplain
	 */
	public void saveRobTenantsComplain(RobTenantsComplainBean robTenantsComplain);

	/**
	 * 根据条件动态查询抢租客的投诉信息
	 * @param map
	 * @return
	 */
	public List<RobTenantsComplainBean> getRobTenantsComplainListByItems(Map map);
}
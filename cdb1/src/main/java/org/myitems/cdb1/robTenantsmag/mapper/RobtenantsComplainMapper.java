package org.myitems.cdb1.robTenantsmag.mapper;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.RobTenantsComplainBean;

public interface RobtenantsComplainMapper {

	/**
	 * 根据条件动态查询抢租客的投诉信息
	 * @param map
	 * @return
	 */
	public List<RobTenantsComplainBean> getRobTenantsComplainListByItems(Map map);
}

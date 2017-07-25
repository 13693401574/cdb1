package org.myitems.cdb1.robTenantsmag.dao;

import org.myitems.cdb1.beans.RobTenantsBean;

public interface IRobTenantsDao {
	/**
	 * 注册抢租客
	 * @param robTenants
	 */
	public void saveRobTenants(RobTenantsBean robTenants);
	
	/**
	 * 查看抢租客详细信息
	 * @param id
	 * @return 抢租客对象
	 */
	public RobTenantsBean getRobTenantsById(Long id);
	
	/**
	 * 修改抢租客的信息，不允许修改用户名、真实姓名、身份证号码
	 * @param landlady
	 */
	public void updateRobTenants(RobTenantsBean robTenants);
}

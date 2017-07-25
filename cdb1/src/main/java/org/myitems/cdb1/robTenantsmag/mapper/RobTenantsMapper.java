package org.myitems.cdb1.robTenantsmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.myitems.cdb1.beans.RobTenantsBean;

public interface RobTenantsMapper {
	/**
	 * 查看抢租客详细信息
	 * @param id
	 * @return 抢租客对象
	 */
	@Select("select * from t_robTenants where id=#{id}")
	public RobTenantsBean getRobTenantsById(@Param("id")Long id);
}

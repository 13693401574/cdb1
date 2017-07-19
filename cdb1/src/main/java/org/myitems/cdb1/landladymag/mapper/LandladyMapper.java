package org.myitems.cdb1.landladymag.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.myitems.cdb1.beans.LandladyBean;

/**
 * mybatis的包租婆的mapper映射
 * @author Administrator
 *
 */
public interface LandladyMapper {

	/**
	 * 查看包租婆详细信息
	 * @param id
	 * @return 包租婆对象
	 */
	
	@Select("select * from t_landlady where id=#{id}")
	public LandladyBean getLandladyById(@Param("id")Long id);
}

package org.myitems.cdb1.landladymag.dao;

import org.myitems.cdb1.beans.LandladyBean;

/**
 * 包租婆持久层接口
 * @author Administrator
 *
 */
public interface ILandladyDao {

	/**
	 * 注册包租婆
	 * @param landlady
	 */
	public void saveLandlady(LandladyBean landlady);
	
	/**
	 * 查看包租婆详细信息
	 * @param id
	 * @return 包租婆对象
	 */
	public LandladyBean getLandladyById(Long id);
	
	/**
	 * 修改包租婆的信息，不允许修改用户名、真实姓名、身份证号码
	 * @param landlady
	 */
	public void updateLandlady(LandladyBean landlady);
}

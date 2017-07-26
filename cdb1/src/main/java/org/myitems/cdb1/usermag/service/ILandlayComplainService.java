package org.myitems.cdb1.usermag.service;

import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.LandladyComplainBean;

/**
 * 包租婆投诉受理模块
 * @author Administrator
 *
 */
public interface ILandlayComplainService {

	/**
	 * 受理包租婆投诉信息
	 * @param id 包租婆投诉类的id
	 * @return 包租婆投诉的详细信息
	 */
	public LandladyComplainBean getLandlayCompliainInfo(Long id);
	
	/**
	 * 受理后被投诉方的状态改变
	 * @param status 投诉的状态
	 * @param id 投诉的id
	 * 
	 */
	public void RobTenanStatus(String status,Long id);
	
	public ComplainBean getDealInfo(Long id);
}

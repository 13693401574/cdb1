package org.myitems.cdb1.usermag.dao;

import java.util.List;

import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.RobTenantsComplainBean;
/**
 * 抢租客持久层模块
 * @author Administrator
 *
 */
public interface IRobTenantsComlaninDao {
	/**
	 * 显示所有的投诉信息
	 * @return
	 */
	public List<RobTenantsComplainBean> findAll();
	
	/**
	 * 受理抢租客投诉
	 * @param id 抢租客投诉类的id
	 * @return 客投诉的实体类
	 */
	public ComplainBean getRobTenantsComplainInfo(Long id);
	
	/**
	 * 受理后包租婆的状态
	 * @param status 投诉的状态
	 * @return 投诉后的状态
	 */
	public void landlayStatus(String status,Long id);
	
}

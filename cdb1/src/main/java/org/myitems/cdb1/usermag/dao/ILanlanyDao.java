package org.myitems.cdb1.usermag.dao;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CarportApplicationBean;
/**
 * 包租婆查看和审批持久层
 * @author Administrator
 *
 */
public interface ILanlanyDao {
	/**
	 * 加载全部信息和模糊查询
	 * @param map map参数
	 * @return 集合
	 */	 
	public List<?> findAll(Map map);

	/**
	 * 查看包租婆申请车位的信息
	 * @param id 发布车位的id
	 * @return 包租婆发布车位的详细信息
	 */
	public CarportApplicationBean selectLandlayCarportInfo(Long id);
	/**
	 * 查询后执行的操作（改变其状态）
	 * @param status 状态
	 * @return 新的状态
	 */
	public void updateCarportApplicationBeanStatus(String status,Long id);
	
}

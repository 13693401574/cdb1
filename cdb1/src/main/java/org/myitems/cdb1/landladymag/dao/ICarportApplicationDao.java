package org.myitems.cdb1.landladymag.dao;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CarportApplicationBean;

/**
 * 包租婆车位申请持久层接口
 * @author Administrator
 *
 */
public interface ICarportApplicationDao {

	/**
	 * 添加车位申请
	 * @param carportApplication
	 */
	public void saveCarportApplication(CarportApplicationBean carportApplication);
	/**
	 * 根据车位申请Id查看车位申请的详细信息
	 * @param id
	 * @return
	 */
	public CarportApplicationBean getCarportApplicationById(Long id);
	/**
	 * 根据车位申请Id删除车位申请,删除的车位申请审核状态只能为未审核
	 * @param id
	 * @return
	 */
	public void deleteCarportApplicationById(CarportApplicationBean c);
	/**
	 * 根据条件动态查询车位申请的总条数
	 * @param map
	 * @return
	 */
	public int getCountCarportApplicationByItems(Map map);
	/**
	 * 根据条件动态查询车位申请
	 * @param map
	 * @return
	 */
	public List<CarportApplicationBean> getCarportApplicationListByItems(Map map);
}

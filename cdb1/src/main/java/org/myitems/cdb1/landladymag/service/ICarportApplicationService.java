package org.myitems.cdb1.landladymag.service;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.beans.Pager;

/**
 * 车位申请业务层接口
 * @author Administrator
 *
 */
public interface ICarportApplicationService {

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
	 * 根据条件动态分页查询包租婆车位申请信息
	 * @param id
	 * @return
	 */
	public Pager getCarportApplicationListByItems(Map map,Pager page);
	/**
	 * 根据包租婆的Id查询车位所在小区
	 * @param fkLandladyId
	 * @return
	 */
	public List<String> getCarportAddressNameByFkLandladyId(Long fkLandladyId);
}

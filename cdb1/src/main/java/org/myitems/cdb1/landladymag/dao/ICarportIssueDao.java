package org.myitems.cdb1.landladymag.dao;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CarportIssueBean;

/**
 * 车位信息发布的持久层接口
 * @author Administrator
 *
 */
public interface ICarportIssueDao {

	/**
	 * 包租婆发布招租车位信息，发布的车位信息必须是申请通过审核的才能发布，并且一个车位不能重复发布招租信息
	 * @param carportIssue
	 */
	public void saveCarportIssue(CarportIssueBean carportIssue);
	/**
	 * 根据发出招租车位信息Id查询招租车位信息
	 * @param id
	 * @return
	 */
	public CarportIssueBean getCarportIssueById(Long id);
	/**
	 * 根据招租车位信息id删除招租信息
	 * @param id
	 */
	public void deleteCarportIssueById(Long id);
	/**
	 * 根据条件动态查询包租婆发布招租车位信息的总条数
	 * @param map
	 * @return
	 */
	public int getCountCarportIssueListByItems(Map map);
	
	/**
	 * 根据条件动态查询包租婆发布招租车位信息
	 * @param map
	 * @return
	 */
	public List<CarportIssueBean> getCarportIssueListByItems(Map map);
}

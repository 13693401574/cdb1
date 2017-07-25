package org.myitems.cdb1.landladymag.service;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CarportIssueBean;
import org.myitems.cdb1.beans.Pager;

/**
 * 包租婆发布车位业务层接口
 * @author Administrator
 *
 */
public interface ICarportIssueService {

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
	public void deleteCarportIssueById(CarportIssueBean c);
	/**
	 * 根据条件动态分页查询包租婆发布的车位信息
	 * @param id
	 * @param page
	 * @return
	 */
	public Pager getCarportIssueListByItems(Map map,Pager page);
	

}

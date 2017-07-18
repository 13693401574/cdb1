package org.myitems.cdb1.systenmag.service;

import java.util.List;
import java.util.Map;

import org.myitems.cdb1.beans.CarportBean;
import org.myitems.cdb1.beans.OutThreeBean;
import org.myitems.cdb1.beans.Pager;

/**
 * CBD车位管理模块 业务层接口
 * @author Administrator
 *
 */
public interface ICarportManageService {

	/**
	 * 获取CDB管理的所有的车位的分页对象
	 * @param map  查询条件，包含从第几页显示，每页显示几条
	 * @param pager 分页对象
	 * @return 返回分页对象
	 */
	public Pager getCarportByMapToPager(Map map,Pager pager);
	
	/**
	 * 查找所有状态为在约的三方外部合约
	 * @return
	 */
	public List<OutThreeBean> getAllOutThreeContract();
	
	/**
	 * 单车位添加
	 * @param carport 单个车位对象
	 * @return 受影响的行数
	 */
	public int addCarportInfo(CarportBean carport);
	
	/**
	 * 批量添加
	 * @param id 外部合约的id
	 * @param talNum 添加车位的数量
	 * @return 受影响的行数
	 */
	public int addBatchCarportInfo(Long id,int talNum);
	
	
}

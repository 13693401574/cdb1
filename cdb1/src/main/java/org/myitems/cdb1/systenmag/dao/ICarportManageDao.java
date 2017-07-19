package org.myitems.cdb1.systenmag.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.myitems.cdb1.beans.CarportBean;
import org.myitems.cdb1.beans.OutThreeBean;

/**
 * 车位管理持久层接口
 * @author Administrator
 *
 */
public interface ICarportManageDao {

	/**
	 * 统计CBD管理的车位的总条数
	 * @param map 查询条件，状态要为 在约
	 * @return 总条数
	 */
	public int countCarportNumByMapToPager(@Param("map")Map map);
	
	/**
	 * 查询CDB管理的所有车位的具体信息
	 * @param map 查询条件，包含了从第几页开始查，和每页显示多少条
	 * @return  企业已租车位信息集合
	 */
	public List<?> findCarportListByMapToPager(@Param("map")Map map);
	
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
	 * 批量添加车位 
	 * @param carports 车位集合
	 * @return 受影响的行数
	 */
	public int addBatchCarportInfo(List<CarportBean> carports);
	
}

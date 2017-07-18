package org.myitems.cdb1.contractmag.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.myitems.cdb1.beans.OutThreeBean;

/**
 * 外部合约管理模块 持久层接口
 * @author Administrator
 *
 */
public interface IOutThreeContractDao {
	
	/**
	 * 统计三方合约在约的总条数
	 * @param map 查询条件
	 * @return 总条数
	 */
	public int countOutThreeContactNumByMapToPager(@Param("map")Map map);
	
	/**
	 * 查询三方合约再约的具体信息
	 * @param map 查询条件，包含了从第几页开始查，和每页显示多少条
	 * @return  企业已租车位信息集合
	 */
	public List<?> findOutThreeContractListByMapToPager(@Param("map")Map map);

	/**
	 * 根据id查找合约信息
	 * @param id 合约id
	 * @return 合约对象
	 */
	public OutThreeBean findOutThreeContractById(Long id);
	
	/**
	 * 新增、续约外部合约
	 * @param outThree 外部合约对象
	 */
	public void addOutThreeContract(OutThreeBean outThreeBean);
	
	/**根据合约id修改合约状态（解约） */
	public int updateOutThreeContractState(Long id);

}

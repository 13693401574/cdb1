package org.myitems.cdb1.contractmag.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.myitems.cdb1.beans.OutThreeBean;
import org.myitems.cdb1.beans.Pager;

/**
 * 外部合约管理模块 业务层接口
 * @author Administrator
 *
 */
public interface IOutTreeContractService {
	
	/**
	 * 获取外部合约的分页对象
	 * @param map
	 * @param pager
	 * @return
	 */
	public Pager getOutThreeContractByMapToPager(Map map,Pager pager);
	
	
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

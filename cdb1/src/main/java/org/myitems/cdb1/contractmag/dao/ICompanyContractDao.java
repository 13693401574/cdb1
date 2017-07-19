package org.myitems.cdb1.contractmag.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.myitems.cdb1.beans.CompanyContractBean;

/**
 * 租户合约管理模块   持久层接口
 * @author Administrator
 *
 */
public interface ICompanyContractDao {
	
	/**
	 * 统计租户合约在约的总条数
	 * @param map 查询条件，状态要为 在约
	 * @return 总条数
	 */
	public int countCompanyContactNumByMapToPager(@Param("map")Map map);
	
	/**
	 * 查询状态为在约的租户合约的具体信息
	 * @param map 查询条件，包含了从第几页开始查，和每页显示多少条
	 * @return  企业已租车位信息集合
	 */
	public List<?> findCompanyContractListByMapToPager(@Param("map")Map map);

	/**
	 * 根据id查找租户合约信息
	 * @param id 合约id
	 * @return 合约对象
	 */
	public CompanyContractBean findCompanyContractById(Long id);
	
	/**
	 * 新增、续约外部合约
	 * @param outThree 外部合约对象
	 */
	public void addCompanyContract(CompanyContractBean companyContract);
	
	/**
	 * 根据合约id修改租户合约状态（解约）
	 * @param id 租户合约id
	 * @return 改变的行数
	 */
	public int updateConpanyContractState(Long id);
}

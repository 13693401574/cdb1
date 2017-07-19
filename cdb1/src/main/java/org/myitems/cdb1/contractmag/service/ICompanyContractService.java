package org.myitems.cdb1.contractmag.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.myitems.cdb1.beans.CompanyContractBean;
import org.myitems.cdb1.beans.OutThreeBean;
import org.myitems.cdb1.beans.Pager;

/**
 * 租户合约管理模块   业务层接口
 * @author Administrator
 *
 */
public interface ICompanyContractService {
	
	/**获取租户合约的分页对象*/
	public Pager getCompanyContractByMapToPager(Map map,Pager pager);
	
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

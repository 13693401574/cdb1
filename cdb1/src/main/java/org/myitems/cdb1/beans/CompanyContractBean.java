package org.myitems.cdb1.beans;
/**
 * 租户合约实体类
 * @author ljj
 *
 */
public class CompanyContractBean {
	/**id*/
	private Long id;
	/**企业用户名称*/
	private String companyName;
	/**合同编号*/
	private String contractNumber;
	/**合同生效日期*/
	private String startTime;
	/**合同结束日期*/
	private String endTime;
	/**合同复印件*/
	private String contractCopies;
	/**企业外键*/
	private CompanyUserBean companyUser;
	public CompanyContractBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getContractCopies() {
		return contractCopies;
	}
	public void setContractCopies(String contractCopies) {
		this.contractCopies = contractCopies;
	}
	public CompanyUserBean getCompanyUser() {
		return companyUser;
	}
	public void setCompanyUser(CompanyUserBean companyUser) {
		this.companyUser = companyUser;
	}
	
	
	
}

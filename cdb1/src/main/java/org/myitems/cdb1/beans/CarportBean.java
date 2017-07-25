package org.myitems.cdb1.beans;
/**
 * CBD管理的车位表
 * @author ljj
 *
 */
public class CarportBean {
	/**id*/
	private Long id;
	/**车位编号*/
	private String carportNumber;
	/**车位地址*/
	private String carportAddress;
	/**租户合约外键*/
	private CompanyContractBean companyContract;
	/**外部合约外键*/
	private OutThreeBean outThree;
	public CarportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCarportNumber() {
		return carportNumber;
	}
	public void setCarportNumber(String carportNumber) {
		this.carportNumber = carportNumber;
	}
	public String getCarportAddress() {
		return carportAddress;
	}
	public void setCarportAddress(String carportAddress) {
		this.carportAddress = carportAddress;
	}
	public CompanyContractBean getCompanyContract() {
		return companyContract;
	}
	public void setCompanyContract(CompanyContractBean companyContract) {
		this.companyContract = companyContract;
	}
	public OutThreeBean getOutThree() {
		return outThree;
	}
	public void setOutThree(OutThreeBean outThree) {
		this.outThree = outThree;
	}
	
	
	
	
}

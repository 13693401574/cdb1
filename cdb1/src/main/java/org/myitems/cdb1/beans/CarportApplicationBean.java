package org.myitems.cdb1.beans;
/**
 * 包租婆车位申请表实体类
 * @author ljj
 *
 */
public class CarportApplicationBean {
	/**id*/
	private Long id;
	/**车位产权证编号*/
	private String carportEquityCode;
	/**车位所在小区地址*/
	private String carportAddress;
	/**小区车位编号*/
	private String carportAddressCode;
	/**车位产权证复印件*/
	private String equityCopies;
	/**申请状态*/
	private String status;
	/**包租婆外键*/
	private LandladyBean landlady;
	public CarportApplicationBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCarportEquityCode() {
		return carportEquityCode;
	}
	public void setCarportEquityCode(String carportEquityCode) {
		this.carportEquityCode = carportEquityCode;
	}
	public String getCarportAddress() {
		return carportAddress;
	}
	public void setCarportAddress(String carportAddress) {
		this.carportAddress = carportAddress;
	}
	public String getCarportAddressCode() {
		return carportAddressCode;
	}
	public void setCarportAddressCode(String carportAddressCode) {
		this.carportAddressCode = carportAddressCode;
	}
	public String getEquityCopies() {
		return equityCopies;
	}
	public void setEquityCopies(String equityCopies) {
		this.equityCopies = equityCopies;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LandladyBean getLandlady() {
		return landlady;
	}
	public void setLandlady(LandladyBean landlady) {
		this.landlady = landlady;
	}
	
	
	
	
}

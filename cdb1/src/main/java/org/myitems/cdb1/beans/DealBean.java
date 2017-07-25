package org.myitems.cdb1.beans;

import javax.persistence.Column;

/**
 * 抢租客历史记录实体类
 * @author ljj
 *
 */
public class DealBean {
	/**id*/
	private Long id;
	/**包租婆id外键*/
	private LandladyBean landlady;
	/**包租婆姓名*/
	private String landladyName;
	/**抢租客id外键*/
	private RobTenantsBean robTenants;
	/**抢租客姓名*/
	private String robManName;
	/**状态*/
	private String status;
	/**车位发布外键*/
	private CarportIssueBean carportIssue;
	/**车位信息*/
	private String carprotInfo;
	/**投诉时间*/
	private String complainantDate;
	/**租赁开始时间*/
	private String startTime;
	/**租赁结束时间*/
	private String endTime;

	
	public DealBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DealBean(Long id, LandladyBean landlady, String landladyName, RobTenantsBean robTenants, String robManName,
			String status, CarportIssueBean carportIssue, String carprotInfo, String carportAddress,
			String carportAddressCode, String complainantDate, String startTime, String endTime, String tuserName,
			String trealName, String tphone, String tidCard, String tjobDescribe, String buserName, String brealName,
			String bphone, String bidCard, String bjobDescribe) {
		super();
		this.id = id;
		this.landlady = landlady;
		this.landladyName = landladyName;
		this.robTenants = robTenants;
		this.robManName = robManName;
		this.status = status;
		this.carportIssue = carportIssue;
		this.carprotInfo = carprotInfo;
	
		this.complainantDate = complainantDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LandladyBean getLandlady() {
		return landlady;
	}

	public void setLandlady(LandladyBean landlady) {
		this.landlady = landlady;
	}

	public String getLandladyName() {
		return landladyName;
	}

	public void setLandladyName(String landladyName) {
		this.landladyName = landladyName;
	}

	public RobTenantsBean getRobTenants() {
		return robTenants;
	}

	public void setRobTenants(RobTenantsBean robTenants) {
		this.robTenants = robTenants;
	}

	public String getRobManName() {
		return robManName;
	}

	public void setRobManName(String robManName) {
		this.robManName = robManName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CarportIssueBean getCarportIssue() {
		return carportIssue;
	}

	public void setCarportIssue(CarportIssueBean carportIssue) {
		this.carportIssue = carportIssue;
	}

	public String getCarprotInfo() {
		return carprotInfo;
	}

	public void setCarprotInfo(String carprotInfo) {
		this.carprotInfo = carprotInfo;
	}

	

	public String getComplainantDate() {
		return complainantDate;
	}

	public void setComplainantDate(String complainantDate) {
		this.complainantDate = complainantDate;
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

	







	

	
	
	
}

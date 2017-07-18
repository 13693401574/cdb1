package org.myitems.cdb1.beans;
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
	/**租赁开始时间*/
	private String startTime;
	/**租赁结束时间*/
	private String endTime;
	public DealBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLandladyName() {
		return landladyName;
	}
	public void setLandladyName(String landladyName) {
		this.landladyName = landladyName;
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
	
	public String getCarprotInfo() {
		return carprotInfo;
	}
	public void setCarprotInfo(String carprotInfo) {
		this.carprotInfo = carprotInfo;
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
	public LandladyBean getLandlady() {
		return landlady;
	}
	public void setLandlady(LandladyBean landlady) {
		this.landlady = landlady;
	}
	public RobTenantsBean getRobTenants() {
		return robTenants;
	}
	public void setRobTenants(RobTenantsBean robTenants) {
		this.robTenants = robTenants;
	}
	public CarportIssueBean getCarportIssue() {
		return carportIssue;
	}
	public void setCarportIssue(CarportIssueBean carportIssue) {
		this.carportIssue = carportIssue;
	}
	
	
}

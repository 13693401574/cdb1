package org.myitems.cdb1.beans;
/**
 * 车位发布实体类
 * @author ljj
 *
 */
public class CarportIssueBean {
	/**id*/
	private Long id;
	/**租赁开始时间*/
	private String startTime;
	/**租赁结束时间*/
	private String endTime;
	/**租赁价格*/
	private String price;
	/**状态*/
	private String status;
	/**车位申请表实体Bean*/
	private CarportApplicationBean appBean;
	public CarportIssueBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public CarportApplicationBean getAppBean() {
		return appBean;
	}
	public void setAppBean(CarportApplicationBean appBean) {
		this.appBean = appBean;
	}
	
	
	
	
}

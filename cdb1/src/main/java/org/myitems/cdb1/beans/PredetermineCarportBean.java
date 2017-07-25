package org.myitems.cdb1.beans;
/**
 * 预约信息实体类
 * @author ljj
 *
 */
public class PredetermineCarportBean {
	/**id*/
	private Long id;
	/**留言信息*/
	private String message;
	/**状态*/
	private String status;
	/**抢租客实体Bean*/
	private RobTenantsBean robBean;
	/**发布车位信息实体Bean*/
	private CarportIssueBean carBean;
	/**包租婆实体Bean*/
	private LandladyBean landlady;
	public PredetermineCarportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public RobTenantsBean getRobBean() {
		return robBean;
	}
	public void setRobBean(RobTenantsBean robBean) {
		this.robBean = robBean;
	}
	public CarportIssueBean getCarBean() {
		return carBean;
	}
	public void setCarBean(CarportIssueBean carBean) {
		this.carBean = carBean;
	}
	public LandladyBean getLandlady() {
		return landlady;
	}
	public void setLandlady(LandladyBean landlady) {
		this.landlady = landlady;
	}
	
}

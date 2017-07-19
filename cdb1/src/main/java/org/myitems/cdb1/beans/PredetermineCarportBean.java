package org.myitems.cdb1.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 预约信息实体类
 * @author ljj
 *
 */
@Entity
@Table(name="t_predetermineCarport")
public class PredetermineCarportBean {
	@Id
	@Column(name="id")
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	/**id*/
	private Long id;
	@Column(name="message",length=120)
	/**留言信息*/
	private String message;
	@Column(name="status",length=20)
	/**状态*/
	private String status;
	
//	/**抢租客实体Bean*/
//	private RobTenantsBean robBean;
	@ManyToOne(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	@JoinColumn(name="fkCorportIssueId")
	/**发布车位信息实体Bean*/
	private CarportIssueBean carBean;
	@ManyToOne(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	@JoinColumn(name="fkLandladyId")
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
//	public RobTenantsBean getRobBean() {
//		return robBean;
//	}
//	public void setRobBean(RobTenantsBean robBean) {
//		this.robBean = robBean;
//	}
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

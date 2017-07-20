package org.myitems.cdb1.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 抢租客历史记录实体类
 * @author ljj
 *
 */
@Entity
@Table(name="t_deal")
public class DealBean {
	@Id
	@Column(name="id")
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	/**id*/
	private Long id;
	@ManyToOne(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	@JoinColumn(name="fkLandladyId")
	/**包租婆id外键*/
	private LandladyBean landlady;
	@ManyToOne(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	@JoinColumn(name="fkRobManId")
	/**抢租客id外键*/
	private RobTenantsBean robTenants;
	@Column(name="status")
	/**状态*/
	private String status;
	@OneToOne(cascade=CascadeType.REMOVE,fetch=FetchType.EAGER)
	@JoinColumn(name="fkCarportIssueId")
	/**车位发布外键*/
	private CarportIssueBean carportIssue;
	@OneToOne(cascade=CascadeType.REMOVE,fetch=FetchType.EAGER,mappedBy="dealBean")
	/**投诉的实体类*/
	private LandladyComplainBean landladyComplainBean;
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
	@Override
	public String toString() {
		return "DealBean [id=" + id + ", landlady=" + landlady + ", robTenants=" + robTenants + ", status=" + status
				+ ", carportIssue=" + carportIssue + ", landladyComplainBean=" + landladyComplainBean + "]";
	}
	
	
}

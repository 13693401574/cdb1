package org.myitems.cdb1.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 车位发布实体类
 * @author ljj
 *
 */
@Entity
@Table(name="t_carportIssue")
public class CarportIssueBean {
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	/**id*/
	private Long id;
	@Column(name="startTime",length=20)
	/**租赁开始时间*/
	private String startTime;
	@Column(name="endTime",length=20)
	/**租赁结束时间*/
	private String endTime;
	@Column(name="price",length=20)
	/**租赁价格*/
	private String price;
	@Column(name="status",length=20)
	/**状态*/
	private String status;
	@ManyToOne(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	@JoinColumn(name="fkCarportApplicationId")
	/**车位申请表实体Bean*/
	private CarportApplicationBean appBean;
	@ManyToOne(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	@JoinColumn(name="fkLandladyId")
	/**包租婆实体类*/
	private LandladyBean landlady;
	@OneToOne(cascade=CascadeType.REMOVE,fetch=FetchType.EAGER,mappedBy="carportIssue")
	/**历史记录实体类*/
	private DealBean deal;
	@OneToMany(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY,mappedBy="carBean")
	/**车位预约实体类集合*/
	private List<PredetermineCarportBean> predetermineCarportList;
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
	public LandladyBean getLandlady() {
		return landlady;
	}
	public void setLandlady(LandladyBean landlady) {
		this.landlady = landlady;
	}
	@Override
	public String toString() {
		return "CarportIssueBean [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", price=" + price
				+ ", status=" + status + "]";
	}
	
	
	
	
}

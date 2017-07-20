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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 包租婆车位申请表实体类
 * @author ljj
 *
 */
@Entity
@Table(name="t_carportApplication")
public class CarportApplicationBean {
	@Id
	@Column(name="id")
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	/**id*/
	private Long id;
	
	@Column(name="carportEquityCode",length=20)
	/**车位产权证编号*/
	private String carportEquityCode;
	
	@Column(name="carportAddress",length=50)
	/**车位所在小区地址*/
	private String carportAddress;
	@Column(name="carportAddressCode",length=20)
	/**小区车位编号*/
	private String carportAddressCode;
	@Column(name="equityCopies",length=50)
	/**车位产权证复印件*/
	private String equityCopies;
	@Column(name="status",length=20)
	/**申请状态*/
	private String status;
	/**每条申请的发布信息*/
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="appBean")
	private List<CarportIssueBean> carportIssueList;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fkLandladyId")
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
	public List<CarportIssueBean> getCarportIssueList() {
		return carportIssueList;
	}
	public void setCarportIssueList(List<CarportIssueBean> carportIssueList) {
		this.carportIssueList = carportIssueList;
	}
	@Override
	public String toString() {
		return "CarportApplicationBean [id=" + id + ", carportEquityCode=" + carportEquityCode + ", carportAddress="
				+ carportAddress + ", carportAddressCode=" + carportAddressCode + ", equityCopies=" + equityCopies
				+ ", status=" + status + "]";
	}
	
	
	
	
}

package org.myitems.cdb1.beans;

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
 * 包租婆车位申请表实体类
 * @author ljj
 */
@Entity
@Table(name="t_carportapplication")
public class CarportApplicationBean {
	/**id*/
	@Id
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	private Long id;
	
	/**车位产权证编号*/
	@Column(name="carportEquityCode",length=20)
	private String carportEquityCode;
	
	/**车位所在小区地址*/
	@Column(name="carportAddress",length=50)
	private String carportAddress;
	
	/**小区车位编号*/
	@Column(name="carportAddressCode",length=20)
	private String carportAddressCode;
	
	/**车位产权证复印件*/
	@Column(name="equityCopies",length=50)
	private String equityCopies;
	
	/**申请状态*/
	@Column(name="status",length=20)
	private String status;
	/**包租婆外键*/
	@ManyToOne(fetch=FetchType.EAGER)//抓取方式是及时刷新
	@JoinColumn(name="fkLandladyId")
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
	@Override
	public String toString() {
		return "CarportApplicationBean [id=" + id + ", carportEquityCode=" + carportEquityCode + ", carportAddress="
				+ carportAddress + ", carportAddressCode=" + carportAddressCode + ", equityCopies=" + equityCopies
				+ ", status=" + status + ", landlady=" + landlady + "]";
	}
	
	
	
	
}

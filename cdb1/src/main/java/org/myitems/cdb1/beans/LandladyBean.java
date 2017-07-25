package org.myitems.cdb1.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 包租婆实体类
 * @author ljj
 *
 */
@Entity
@Table(name="t_landlady")
public class LandladyBean {
	/**id*/
	@Id
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	private Long id;
	
	/**用户名*/
	@Column(name="userName",length=20)
	private String userName;
	
	/**密码*/
	@Column(name="pwd",length=20)
	private String pwd;
	
	/**真实姓名*/
	@Column(name="realName",length=20)
	private String realName;
	
	/**地址*/
	@Column(name="address",length=50)
	private String address;
	
	/**电话号码*/
	@Column(name="phone",length=11)
	private String phone;
	
	/**身份证号码*/
	@Column(name="idCard",length=18)
	private String idCard;
	
	/**职业描述*/
	@Column(name="jobDescribe",length=120)
	private String jobDescribe;
	/**邮箱地址*/
	@Column(name="email",length=120)
	private String email;
	
	/**信誉度*/
	@Column(name="credibility",length=20)
	private String credibility;
	
	/**包租婆车位申请集合*/
	//级联方式是all,懒加载，对应的，拥有发布信息类拥有包租婆
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="landlady")
	
	private List<CarportApplicationBean> carportApplicationList;
	
	/**包租婆车位发布集合*//*
	private List<CarportIssueBean> carportIssueList;
	*//**包租婆预约信息集合*//*
	private List<PredetermineCarportBean> predetermineCarportp;
	*//**包租婆历史记录集合*//*
	private List<DealBean> dealList;
	*//**包租婆投诉记录集合*//*
	private List<LandladyComplainBean> landladyComplainList;*/
	
	public LandladyBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getJobDescribe() {
		return jobDescribe;
	}
	public void setJobDescribe(String jobDescribe) {
		this.jobDescribe = jobDescribe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCredibility() {
		return credibility;
	}
	public void setCredibility(String credibility) {
		this.credibility = credibility;
	}
	public List<CarportApplicationBean> getCarportApplicationList() {
		return carportApplicationList;
	}
	public void setCarportApplicationList(List<CarportApplicationBean> carportApplicationList) {
		this.carportApplicationList = carportApplicationList;
	}
/*	public List<CarportIssueBean> getCarportIssueList() {
		return carportIssueList;
	}
	public void setCarportIssueList(List<CarportIssueBean> carportIssueList) {
		this.carportIssueList = carportIssueList;
	}
	public List<PredetermineCarportBean> getPredetermineCarportp() {
		return predetermineCarportp;
	}
	public void setPredetermineCarportp(List<PredetermineCarportBean> predetermineCarportp) {
		this.predetermineCarportp = predetermineCarportp;
	}
	public List<DealBean> getDealList() {
		return dealList;
	}
	public void setDealList(List<DealBean> dealList) {
		this.dealList = dealList;
	}
	public List<LandladyComplainBean> getLandladyComplainList() {
		return landladyComplainList;
	}
	public void setLandladyComplainList(List<LandladyComplainBean> landladyComplainList) {
		this.landladyComplainList = landladyComplainList;
	}*/
	
}

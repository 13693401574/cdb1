package org.myitems.cdb1.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

/**
 * 包租婆实体类
 * @author ljj
 *
 */
@Entity
@Table(name="t_landlady")
public class LandladyBean {
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	/**id*/
	private Long id;
	@Column(name="userName",length=20)
	/**用户名*/
	private String userName;
	@Column(name="pwd",length=20)
	/**密码*/
	private String pwd;
	@Column(name="realName",length=20)
	/**真实姓名*/
	private String realName;
	@Column(name="address",length=50)
	/**地址*/
	private String address;
	@Column(name="phone",length=11)
	/**电话号码*/
	private String phone;
	@Column(name="idCard",length=18)
	/**身份证号码*/
	private String idCard;
	@Column(name="jobDescribe",length=120)
	/**职业描述*/
	private String jobDescribe;
	@Column(name="email",length=120)
	/**邮箱地址*/
	private String email;
	@Column(name="credibility",length=20)
	/**信誉度*/
	private String credibility="0/0";
	
	@OneToMany(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY,mappedBy="landlady")
	/**包租婆车位申请集合*/
	private List<CarportApplicationBean> carportApplicationList;
	@OneToMany(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY,mappedBy="landlady")
	/**包租婆车位发布集合*/
	private List<CarportIssueBean> carportIssueList;
	@OneToMany(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY,mappedBy="landlady")	
	/**包租婆预约信息集合*/
	private List<PredetermineCarportBean> predetermineCarportp;
	@OneToMany(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY,mappedBy="landlady")
	/**包租婆历史记录集合*/
	private List<DealBean> dealList;
	@OneToMany(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY,mappedBy="landlady")
	/**包租婆投诉记录集合*/
	private List<LandladyComplainBean> landladyComplainList;
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
	public List<CarportIssueBean> getCarportIssueList() {
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
	}
	@Override
	public String toString() {
		return "LandladyBean [id=" + id + ", userName=" + userName + ", pwd=" + pwd + ", realName=" + realName
				+ ", address=" + address + ", phone=" + phone + ", idCard=" + idCard + ", jobDescribe=" + jobDescribe
				+ ", email=" + email + ", credibility=" + credibility + "]";
	}
	
}

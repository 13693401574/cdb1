package org.myitems.cdb1.beans;
/**
 * 抢租客实体类
 * @author ljj
 *
 */

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_robTenants")
public class RobTenantsBean {
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
	@OneToMany(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY,mappedBy="robBean")
	/**预约记录集合*/
	private List<PredetermineCarportBean> predetermineCarportList;
	/**抢租客对应的历史记录实体类集合*/
	private List<DealBean> dealList;
	/**抢租客对应的投诉类集合*/
	private List<RobTenantsComplainBean> robTenantsComplainList;
	public RobTenantsBean() {
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
	
	
	
}

package org.myitems.cdb1.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 企业用户实体类
 * @author ljj
 *
 */
@Entity
@Table(name="t_companyuser")
public class CompanyUserBean {
	/**企业用户id*/
	@Id
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	private Long id;
	/**企业用户登录名*/
	
	@Column(name="logName",length=20)
	private String loginName;
	/**密码*/
	@Column(name="pwd",length=20)
	private String pwd;
	/**公司名称*/
	@Column(name="companyName",length=50)
	private String companyName;
	/**公司楼层*/
	@Column(name="floor",length=20)
	private String floor;
	/**联系人*/
	@Column(name="linkMan",length=20)
	private String linkMan;
	/**联系电话*/
	@Column(name="linkPhone",length=11)
	private String linkPhone;
	public CompanyUserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	
	
	
	
}

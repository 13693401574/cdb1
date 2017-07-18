package org.myitems.cdb1.beans;
/**
 * 企业用户实体类
 * @author ljj
 *
 */
public class CompanyUserBean {
	/**企业用户id*/
	private Long id;
	/**企业用户登录名*/
	private String loginName;
	/**密码*/
	private String pwd;
	/**公司名称*/
	private String companyName;
	/**公司楼层*/
	private String floor;
	/**联系人*/
	private String linkMan;
	/**联系电话*/
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

package org.myitems.cdb1.beans;
/**
 * 员工实体类
 * @author ljj
 *
 */
public class EmployeeBean {
	/**员工id*/
	private Long id;
	/**工号*/
	private String employeeNumber;
	/**密码*/
	private String pwd;
	/**员工姓名*/
	private String employeeName;
	/**手机号*/
	private String phone;
	/**用户管理权限*/
	private int userManger;
	/**车位管理权限*/
	private int carportManage;
	/**合同管理权限*/
	private int contractsManager;
	/**投诉管理权限*/
	private int complaintManage;
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getUserManger() {
		return userManger;
	}
	public void setUserManger(int userManger) {
		this.userManger = userManger;
	}
	public int getCarportManage() {
		return carportManage;
	}
	public void setCarportManage(int carportManage) {
		this.carportManage = carportManage;
	}
	public int getContractsManager() {
		return contractsManager;
	}
	public void setContractsManager(int contractsManager) {
		this.contractsManager = contractsManager;
	}
	public int getComplaintManage() {
		return complaintManage;
	}
	public void setComplaintManage(int complaintManage) {
		this.complaintManage = complaintManage;
	}
	
	
	
	
}
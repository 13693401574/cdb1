package org.myitems.cdb1.beans;
/**
 * 日志实体类
 * @author ljj
 *
 */
public class LogBean {
	/**日志id*/
	private Long id;
	/**日志信息*/
	private String logInfo;
	/**日志时间*/
	private String logDate;
	public LogBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogInfo() {
		return logInfo;
	}
	public void setLogInfo(String logInfo) {
		this.logInfo = logInfo;
	}
	public String getLogDate() {
		return logDate;
	}
	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}
	
	
	
}

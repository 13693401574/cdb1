package org.myitems.cdb1.beans;
/**
 * 包租婆投诉表实体类
 * @author ljj
 *
 */
public class LandladyComplainBean {
	/**id*/
	private Long id;
	/**投诉人*/
	private String complainant;
	/**被投诉人*/
	private String beComplaint;
	/**投诉时间*/
	private String complainantDate;
	/**投诉状态*/
	private String status;
	/**投诉理由*/
	private String reasons;
	/**历史记录实体类*/
	private DealBean dealBean;
	public LandladyComplainBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComplainant() {
		return complainant;
	}
	public void setComplainant(String complainant) {
		this.complainant = complainant;
	}
	public String getBeComplaint() {
		return beComplaint;
	}
	public void setBeComplaint(String beComplaint) {
		this.beComplaint = beComplaint;
	}
	public String getComplainantDate() {
		return complainantDate;
	}
	public void setComplainantDate(String complainantDate) {
		this.complainantDate = complainantDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReasons() {
		return reasons;
	}
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	public DealBean getDealBean() {
		return dealBean;
	}
	public void setDealBean(DealBean dealBean) {
		this.dealBean = dealBean;
	}
	
}

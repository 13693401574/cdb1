package org.myitems.cdb1.beans;
/**
 * 封装的投诉实体类
 * @author Administrator
 *
 */
public class ComplainBean {
	/**id*/
	private Long id;
	/**投诉人*/
	private String complainant;
	/**被投诉人*/
	private String beComplaint;
	/**投诉理由*/
	private String reasons;
	
	/**车位地址*/
	private String carportAddress;
	/**车位编号*/
	private String carportEquityCode;
	/**投诉时间*/
	private String complainantDate;
	/**租赁开始时间*/
	private String startTime;
	/**租赁结束时间*/
	private String endTime;
	//投诉方
	/**用户名*/
	private String TuserName;
	/**真实姓名*/
	private String TrealName;
	/**电话号码*/
	private String Tphone;	
	/**身份证号码*/
	private String TidCard;	
	/**职业描述*/
	private String TjobDescribe;
	//被投诉方
	/**用户名*/
	private String BuserName;
	/**真实姓名*/
	private String BrealName;
	/**电话号码*/
	private String Bphone;	
	/**身份证号码*/
	private String BidCard;	
	/**职业描述*/
	private String BjobDescribe;
	public ComplainBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComplainBean(Long id, String complainant, String beComplaint, String reasons, String carportAddress,
			String carportEquityCode, String complainantDate, String startTime, String endTime, String tuserName,
			String trealName, String tphone, String tidCard, String tjobDescribe, String buserName, String brealName,
			String bphone, String bidCard, String bjobDescribe) {
		super();
		this.id = id;
		this.complainant = complainant;
		this.beComplaint = beComplaint;
		this.reasons = reasons;
		this.carportAddress = carportAddress;
		this.carportEquityCode = carportEquityCode;
		this.complainantDate = complainantDate;
		this.startTime = startTime;
		this.endTime = endTime;
		TuserName = tuserName;
		TrealName = trealName;
		Tphone = tphone;
		TidCard = tidCard;
		TjobDescribe = tjobDescribe;
		BuserName = buserName;
		BrealName = brealName;
		Bphone = bphone;
		BidCard = bidCard;
		BjobDescribe = bjobDescribe;
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
	public String getReasons() {
		return reasons;
	}
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	public String getCarportAddress() {
		return carportAddress;
	}
	public void setCarportAddress(String carportAddress) {
		this.carportAddress = carportAddress;
	}
	public String getCarportEquityCode() {
		return carportEquityCode;
	}
	public void setCarportEquityCode(String carportEquityCode) {
		this.carportEquityCode = carportEquityCode;
	}
	public String getComplainantDate() {
		return complainantDate;
	}
	public void setComplainantDate(String complainantDate) {
		this.complainantDate = complainantDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTuserName() {
		return TuserName;
	}
	public void setTuserName(String tuserName) {
		TuserName = tuserName;
	}
	public String getTrealName() {
		return TrealName;
	}
	public void setTrealName(String trealName) {
		TrealName = trealName;
	}
	public String getTphone() {
		return Tphone;
	}
	public void setTphone(String tphone) {
		Tphone = tphone;
	}
	public String getTidCard() {
		return TidCard;
	}
	public void setTidCard(String tidCard) {
		TidCard = tidCard;
	}
	public String getTjobDescribe() {
		return TjobDescribe;
	}
	public void setTjobDescribe(String tjobDescribe) {
		TjobDescribe = tjobDescribe;
	}
	public String getBuserName() {
		return BuserName;
	}
	public void setBuserName(String buserName) {
		BuserName = buserName;
	}
	public String getBrealName() {
		return BrealName;
	}
	public void setBrealName(String brealName) {
		BrealName = brealName;
	}
	public String getBphone() {
		return Bphone;
	}
	public void setBphone(String bphone) {
		Bphone = bphone;
	}
	public String getBidCard() {
		return BidCard;
	}
	public void setBidCard(String bidCard) {
		BidCard = bidCard;
	}
	public String getBjobDescribe() {
		return BjobDescribe;
	}
	public void setBjobDescribe(String bjobDescribe) {
		BjobDescribe = bjobDescribe;
	}
	@Override
	public String toString() {
		return "ComplainBean [id=" + id + ", complainant=" + complainant + ", beComplaint=" + beComplaint + ", reasons="
				+ reasons + ", carportAddress=" + carportAddress + ", carportEquityCode=" + carportEquityCode
				+ ", complainantDate=" + complainantDate + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", TuserName=" + TuserName + ", TrealName=" + TrealName + ", Tphone=" + Tphone + ", TidCard="
				+ TidCard + ", TjobDescribe=" + TjobDescribe + ", BuserName=" + BuserName + ", BrealName=" + BrealName
				+ ", Bphone=" + Bphone + ", BidCard=" + BidCard + ", BjobDescribe=" + BjobDescribe + "]";
	}
	
	
	
	
}

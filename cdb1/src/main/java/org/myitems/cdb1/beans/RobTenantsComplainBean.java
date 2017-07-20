package org.myitems.cdb1.beans;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 抢租客投诉表实体类
 * @author ljj
 *
 */
@Entity
@Table(name="t_robTenantsComplain")
public class RobTenantsComplainBean {
	@Id
	@Column(name="id")
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	/**id*/
	private Long id;
	@Column(name="complainant",length=20)
	/**投诉人*/
	private String complainant;
	@Column(name="beComplaint",length=20)
	/**被投诉人*/
	private String beComplaint;
	@Column(name="complainantDate")
	/**投诉时间*/
	private Date complainantDate;
	@Column(name="status")
	/**投诉状态*/
	private String status;
	@Column(name="reasons",length=120)
	/**投诉理由*/
	private String reasons;
	@OneToOne(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	@JoinColumn(name="fkDealId")
	/**历史记录实体类*/
	private DealBean dealBean;
	@ManyToOne(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	@JoinColumn(name="fkRobManId")
	/**抢租客实体类*/
	private RobTenantsBean robBean;
	public RobTenantsComplainBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RobTenantsBean getRobTenantsBean() {
		return robBean;
	}
	public void setRobTenantsBean(RobTenantsBean robBean) {
		this.robBean = robBean;
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
	public Date getComplainantDate() {
		return complainantDate;
	}
	public void setComplainantDate(Date complainantDate) {
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

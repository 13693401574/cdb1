package org.springHibernate.beans;

import java.io.Serializable;
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

@Entity
@Table(name="t_class")
public class Classes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3158959910373899772L;

	@Id
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	private int id;
	
	@Column(name="className",length=20)
	private String className;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY, mappedBy="cla")
	@JsonIgnore 
	private List<Student> stu;
	
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classes(int id, String className, List<Student> stu) {
		super();
		this.id = id;
		this.className = className;
		this.stu = stu;
	}
	public List<Student> getStu() {
		return stu;
	}
	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", className=" + className + "]";
	}

	
}

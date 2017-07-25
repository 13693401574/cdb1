package org.springHibernate.beans;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="t_studenttwo")
public class Student implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9155444098393870258L;
	
	@Id
	@GenericGenerator(name="hb",strategy="identity")
	@GeneratedValue(generator="hb")
	private int id;
	
	@Column(name="studentName",length=20)
	private String studentName;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_clas_id")
	private Classes cla;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}



	public Student(int id, String studentName, Classes cla) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.cla = cla;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Classes getCla() {
		return cla;
	}
	public void setCla(Classes cla) {
		this.cla = cla;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", cla=" + cla + "]";
	}

	
	
	

}

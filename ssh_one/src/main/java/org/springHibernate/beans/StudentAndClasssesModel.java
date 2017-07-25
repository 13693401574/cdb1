package org.springHibernate.beans;

public class StudentAndClasssesModel {


	private Student student;
	private Classes calsses;
	public StudentAndClasssesModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Classes getCalss() {
		return calsses;
	}
	public void setCalss(Classes calsses) {
		this.calsses = calsses;
	}
	public StudentAndClasssesModel(Student student, Classes calsses) {
		super();
		this.student = student;
		this.calsses = calsses;
	}

	@Override
	public String toString() {
		return "StudentAndClasssesModel [student=" + student + ", calss=" + calsses + "]";
	}
	
	
	
	
}

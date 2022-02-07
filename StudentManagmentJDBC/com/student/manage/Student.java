package com.student.manage;

public class Student {
	private int studentID;
	private String studentName;
	private int studentPhone;
	private String studentCity;
	public Student(int studentID, String studentName, int studentPhone, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	
	// We set id as autoincrement in database
	public Student(String studentName, int studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(int studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
}

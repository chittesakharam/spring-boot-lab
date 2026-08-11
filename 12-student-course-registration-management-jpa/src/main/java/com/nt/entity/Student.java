package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId ;
	private String studentName ;
	private String courseName ;
	private Double courseFee ;
	private String instituteName ;
	public Student() {}
	public Student(String studentName, String courseName, Double courseFee, String instituteName) {
		super();
		this.studentName = studentName;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.instituteName = instituteName;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseName=" + courseName
				+ ", courseFee=" + courseFee + ", instituteName=" + instituteName + "]";
	}
	
	
	
       
}

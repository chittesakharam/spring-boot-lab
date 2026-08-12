package com.nt.model;

public class Student {

	private int studentId;
    private String studentName;
    private String email;
    private double marks;
    private char grage;

    public Student() {
    }

	public Student(int studentId, String studentName, String email, double marks, char grage) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.marks = marks;
		this.grage = grage;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public char getGrage() {
		return grage;
	}

	public void setGrage(char grage) {
		this.grage = grage;
	}

    

}
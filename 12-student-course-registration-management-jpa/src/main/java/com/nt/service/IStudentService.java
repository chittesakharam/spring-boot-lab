package com.nt.service;

import com.nt.entity.Student;

public interface IStudentService {
	
	String registerStudent(Student std);
	
	Iterable<Student> getAllStudents();
	Student getStudentById(int id);
	String updateCourse(int id,String course);
	String deleteStudent(int id);
	int countStudents();

}

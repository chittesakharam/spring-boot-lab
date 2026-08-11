package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Student;
import com.nt.service.IStudentService;
@Component
public class StudentController {
	@Autowired
	private IStudentService service;
	
     public void registerStudent(Student std)
     {
    	 String registerStudent = service.registerStudent(std);
    	 IO.println(registerStudent);
     }
	
	public void getAllStudents()
	{
		Iterable<Student> allStudents = service.getAllStudents();
		allStudents.forEach(std->IO.println(std));
	}
	public void getStudentById(int id)
	{
		Student studentById = service.getStudentById(id);
		if(studentById.equals(null))
			throw new IllegalArgumentException("Student Record not Available ");
		IO.println(studentById);
		
	}
	public void updateCourse(int id,String course)
	{
		String updateCourse = service.updateCourse(id, course);
		IO.println(updateCourse);
	}
	public void deleteStudent(int id)
	{
		 String deleteStudent = service.deleteStudent(id);
		 IO.println(deleteStudent);
	}
	public void  countStudents()
	{
		int countStudents = service.countStudents();
		IO.println("Total Student Available is: "+countStudents);
	}

}

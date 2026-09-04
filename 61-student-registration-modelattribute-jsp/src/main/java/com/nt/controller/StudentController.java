package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;


@Controller
public class StudentController {

	
	
	@GetMapping("register")
	public String registerStudent()
	{
		
		
		
		return "student";
	}
    
    @PostMapping("/register")  
	public String showStudentDetails(@ModelAttribute("stud")Student std)
	{
		System.out.println("StudentController.showStudentDetails()");
		return "student_result";
		
	}
}

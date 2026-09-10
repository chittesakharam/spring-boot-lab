package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping()
	public String showHome()
	{
		return "Student API Working Successfully";
	}
	
	@GetMapping("/name")
	public String showStudenDetails()
	{
		return "Student Name: Rahul";
	}

}

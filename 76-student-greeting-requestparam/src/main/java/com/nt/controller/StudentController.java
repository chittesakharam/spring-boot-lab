package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public String welcomeStudentGreet(@RequestParam String name)
	{
		return "Welcome, "+name;
	}

}

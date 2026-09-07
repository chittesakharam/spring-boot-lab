package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String showStudentData(Map<String ,Object> map)
	{
		System.out.println("StudentController.showStudentData()");
		map.put("name","Anjali");
		map.put("course", "Java Full Stack");
		return "student";
	}

}

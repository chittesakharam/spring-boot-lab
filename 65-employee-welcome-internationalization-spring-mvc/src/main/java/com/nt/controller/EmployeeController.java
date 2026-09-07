package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/")
	public String showEmployeeDetails(Map<String,Object> map)
	{
		System.out.println("EmployeeController.showEmployeeDetails()");
		map.put("name", "Rahul Sharma");
		map.put("dept", "IT");
		return "employee";
	}
}

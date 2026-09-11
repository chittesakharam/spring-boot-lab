package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public String showEmployeeDetails(@RequestParam String department)
	{
		return "Employee belongs to "+department+" department";
	}
}

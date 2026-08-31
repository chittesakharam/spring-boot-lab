package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/")
	public String display(Model model)
	{
		model.addAttribute("id",101);
		model.addAttribute("name","Amit");
		model.addAttribute("department","IT");
		model.addAttribute("salary",65000);
		return "details";
	}

}

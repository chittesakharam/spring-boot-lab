package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GreetingController {
	
	@RequestMapping("/employee")
	public String displayEmployee(Model model)
	{
		System.out.println("GreetingController.displayEmployee()");
		model.addAttribute("name","Rahul");
		model.addAttribute("department","IT");
		model.addAttribute("salary",50000);
		return "greeting";
	}

}

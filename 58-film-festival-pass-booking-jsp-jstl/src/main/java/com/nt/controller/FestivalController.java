package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.FestivalPass;


@Controller
public class FestivalController {

	
	@GetMapping("/")
	public String showHomePage()
	{
		System.out.println("FestivalController.showHomePage()");
		return "home";
	}
	@GetMapping("/festival")
	public String registerStudent(@ModelAttribute("fPass") FestivalPass fPass)
	{
		System.out.println("FestivalController.registerStudent()");
		
		return "festival_form";
	}
    
    @PostMapping("/festival")  
	public String showStudentDetails(@ModelAttribute("fPass")FestivalPass fPass)
	{
		System.out.println("FestivalController.showStudentDetails()");
		return "festival_success";
		
	}
}

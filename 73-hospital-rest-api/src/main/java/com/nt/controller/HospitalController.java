package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@GetMapping
	public String showHomePage()
	{
		return "Welcome to City Hospital";
	}
	@GetMapping("/doctor")
	public String showDoctor()
	{
		return "Doctor Available: Dr. Sharma";
	}
	@GetMapping("/emergency")
	public String showEmergency()
	{
		return "Emergency Services Available 24/7";
	}
	

}

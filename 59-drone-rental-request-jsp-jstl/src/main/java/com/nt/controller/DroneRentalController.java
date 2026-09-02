package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.DroneRentalRequest;


@Controller
public class DroneRentalController {

	
	@GetMapping("/")
	public String showHomePage()
	{
		System.out.println("FestivalController.showHomePage()");
		return "home";
	}
	@GetMapping("/drone")
	public String sendRentalReqest(@ModelAttribute("dRequest") DroneRentalRequest dRequest)
	{
		System.out.println("DroneRentalController.sendRentalReqest()");
		
		return "drone_form";
	}
    
    @PostMapping("/drone")  
	public String showRentalDetails(@ModelAttribute("dRequest")DroneRentalRequest dRequest)
	{
		System.out.println("DroneRentalController.showRentalDetails()");
		return "drone_success";
		
	}
}

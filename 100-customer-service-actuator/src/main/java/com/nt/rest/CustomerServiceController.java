package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerServiceController {
	
	@GetMapping("/customer")
	public String getMessage()
	{
		return "Customer Service is runnig";
	}

}

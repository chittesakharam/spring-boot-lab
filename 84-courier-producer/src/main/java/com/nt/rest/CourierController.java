package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourierController {

	@GetMapping("/courier/status")
	public String getCurierStatus()
	{
		return "Courier package is ready for delivery.";
	}
}

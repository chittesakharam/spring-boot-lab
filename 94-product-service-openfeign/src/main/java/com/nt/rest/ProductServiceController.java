package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {
	
	@GetMapping("/service")
	public String getService()
	{
		return "Inventory Service called successfully";
	}

}

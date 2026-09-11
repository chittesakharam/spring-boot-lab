package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@GetMapping("/location/{city}")
	public String showLocation(@RequestParam String state,@PathVariable String city)
	{
		return "City: "+city+", State: "+state;
	}
}

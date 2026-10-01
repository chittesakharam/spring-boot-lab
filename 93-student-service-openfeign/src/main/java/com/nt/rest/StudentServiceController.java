package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {

	@GetMapping("/notification")
	public String sendNotification()
	{
		return "Notification Service is working successfully";
	}
}

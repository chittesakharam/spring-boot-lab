package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

	@GetMapping("/notification")
	public String notificationService()
	{
		IO.println("Notification Service Called");
		return "Notification Service Response";
	}
	
}

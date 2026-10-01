package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.NSFeignClient;

@RestController
public class NotificationServiceController {
	
	private final NSFeignClient service;

	public NotificationServiceController(NSFeignClient service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/notification-service")
	public String getNotification()
	{
		return service.getNotification();
	}

}

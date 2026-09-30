package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.NotificationService;

@RestController
public class ClientController {
	
	private final NotificationService service;

	public ClientController(NotificationService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/notification-client")
	public String getNotification()
	{
	 return	service.sendNotification();
	 
		}

}

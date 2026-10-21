package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class NotificationController {
	
	@GetMapping("/notification")
	@CircuitBreaker(name="notification-service",fallbackMethod = "notificationFallback")
	public ResponseEntity<String> notificationService()
	{
		String msg="Notification Service Called";
		throw new RuntimeException("Notification Service Failed");
		//return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	public ResponseEntity<String> notificationFallback(Exception e)
	{
		return new ResponseEntity<String>("Notification Service Fallback Called",HttpStatus.INTERNAL_SERVER_ERROR);
	}
 
}

package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class MessageProducerController {
	
	@GetMapping("/hello")
	public String sentHelloMsg()
	{
		return "Hello from Producer";
	}
	@GetMapping("/welcome")
	public String sentWelcomeMsg()
	{
		return "Welcome to Spring Boot REST";
	}

}

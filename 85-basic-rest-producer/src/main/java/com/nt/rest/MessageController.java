package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class MessageController {
	
	
	@GetMapping("/message")
	public String sendMessage()
	{
		return "Hello from REST Producer";
	}

}

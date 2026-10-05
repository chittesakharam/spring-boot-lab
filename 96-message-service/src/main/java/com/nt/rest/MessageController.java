package com.nt.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {
	
	@Value("${message}")
	private String msg;

	@GetMapping("/message")
	public String getMessage()
	{
		return msg;
	}
}

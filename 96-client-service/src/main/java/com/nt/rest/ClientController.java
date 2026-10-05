package com.nt.rest;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.invoker.IMessageInvoker;

@RestController
@RefreshScope
public class ClientController {
	
	private final IMessageInvoker service;
	

	
	
	public ClientController(IMessageInvoker service) {
		super();
		this.service = service;
	}




	@GetMapping("/get-message")
	public String getMessage()
	{
		return service.getMessage();
	}
}

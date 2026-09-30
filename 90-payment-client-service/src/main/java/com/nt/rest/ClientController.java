package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.PaymentService;

@RestController
public class ClientController {
	
	private final PaymentService service;

	public ClientController(PaymentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/payment-client")
	public String doPaymet()
	{
		String doPaymet = service.doPaymet();
		return doPaymet;
	}

}

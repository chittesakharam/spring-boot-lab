package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.OSFeingClient;

@RestController
public class OrderServiceController {

    private final OSFeingClient service;

    public OrderServiceController(OSFeingClient service) {
        this.service = service;
    }	
	@GetMapping("/order-client")
	public String displayPaymentDetails()
	{
		return service.doPayment();
	}

}

package com.nt.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Value("${orderId}")
	private Integer orderId;
	@Value("${productName}")
	private String productName;
	
	@GetMapping("/order")
	public String getMessage()
	{
		return "Order Service is running: Order ID: "+orderId+", Proudct Name: "+productName;
	}
	

}

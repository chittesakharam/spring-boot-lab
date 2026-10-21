package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class OrderController {
	
	@GetMapping("/order")
	@CircuitBreaker(name="order-service",fallbackMethod = "orderFallback")
	public ResponseEntity<String> orderService()
	{
		String msg="Order Service Called";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	public ResponseEntity<String> orderFallback(Exception e)
	{
		return new ResponseEntity<String>("Order Service Fallback Called",HttpStatus.INTERNAL_SERVER_ERROR);
	}
 
}

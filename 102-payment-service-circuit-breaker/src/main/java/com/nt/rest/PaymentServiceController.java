package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class PaymentServiceController {
	
	@GetMapping("/payment")
	@CircuitBreaker(name="payment-service",fallbackMethod = "paymentFallback")
	public ResponseEntity<String> paymentService()
	{
		String msg="Payment Service Called";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	public ResponseEntity<String> paymentFallback(Exception e)
	{
		return new ResponseEntity<String>("Payment Service Fallback Called",HttpStatus.INTERNAL_SERVER_ERROR);
	}
 
}

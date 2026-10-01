package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	 @GetMapping("/payment")
	public String doPayment()
	{
		return "Payment Service is called successfully";
	}
}

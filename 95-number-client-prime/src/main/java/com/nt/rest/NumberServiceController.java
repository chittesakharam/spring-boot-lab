package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.NumberService;

@RestController
public class NumberServiceController {

	private final NumberService service;
	
	
	public NumberServiceController(NumberService service) {
		super();
		this.service = service;
	}


	@GetMapping("check-prime/{num}")
	public String checkPrime(@PathVariable Integer num)
	{
		return  service.isPrime(num);
	}
	
	@GetMapping("check-palindrome/{num}")
	public String checkPalindrome(@PathVariable Integer num)
	{
		return  service.isPalindrome(num);
	}
	@GetMapping("check-armstrong/{num}")
	public String checkArmstrong(@PathVariable Integer num)
	{
		return  service.isArmstrong(num);
	}
}

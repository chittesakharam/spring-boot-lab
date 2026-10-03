package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.invoker.NumerServiceInvoker;

@RestController
public class PrimeNumberController {
	
	private final NumerServiceInvoker service;
	
	public PrimeNumberController(NumerServiceInvoker service) {
		super();
		this.service = service;
	}

	@GetMapping("isPrime/{num}")
	public String checkPrimeNumber(@PathVariable Integer num)
	{
		return service.checkPrime(num);
	}
	@GetMapping("isPalindrome/{num}")
	public String checkPalindromeNumber(@PathVariable Integer num)
	{
		return service.checkPalindrome(num);
	}
	@GetMapping("isArmstrong/{num}")
	public String checkArmstrongNumber(@PathVariable Integer num)
	{
		return service.checkArmstrong(num);
	}

}

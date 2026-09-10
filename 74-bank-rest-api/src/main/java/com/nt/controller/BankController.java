package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

	@GetMapping
	public String bankHomePage()
	{
		return "Welcome to ABC Bank";
	}
	@GetMapping("/balance")
	public String showBalance()
	{
		return "Your Balance is ₹50,000";
	}
	@GetMapping("/loan")
	public String showLoanDetails()
	{
		return "Personal Loan Service Available";
	}
}

package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/product/{id}")
	public String showProductDetails(@PathVariable Integer id)
	{
		return "Product ID is "+id;
	}

}

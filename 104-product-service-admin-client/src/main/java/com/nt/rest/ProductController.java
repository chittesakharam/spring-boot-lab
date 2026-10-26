package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/product")
	public String productService()
	{
		IO.println("Product Service Called");
		return "Product Service Response";
	}
	
}

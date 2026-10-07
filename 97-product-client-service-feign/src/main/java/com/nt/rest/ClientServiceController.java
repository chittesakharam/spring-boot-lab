package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.ProductServiceInvoker;
import com.nt.model.Product;

@RestController
@RequestMapping("client-service")
public class ClientServiceController {

	private final ProductServiceInvoker service;

	public ClientServiceController(ProductServiceInvoker service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product product)
	{
		String add = service.addProduct(product);
		return add;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> viewAllProducts()
	{
		List<Product> viewAllProducts = service.viewAllProducts();
		return new ResponseEntity<List<Product>>(viewAllProducts,HttpStatus.OK);
	}
	@GetMapping("product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id)
	{
		Product product = service.getProductById(id);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	@PutMapping("update/{id}")
	public String updateProduct(@PathVariable Integer id,
			                    @RequestBody Product vo)
	{
		String updateProduct = service.updateProduct(id, vo);
		return updateProduct;
	}
	@DeleteMapping("delete/{id}")
	public String deleteProduct(@PathVariable Integer id)
			
	{
		String deleteProduct = service.deleteProduct(id);
		return deleteProduct;
	}
}

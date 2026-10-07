package com.nt.client;

import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.model.Product;

@FeignClient("product-service")
public interface ProductServiceInvoker {

	@PostMapping("/products")
	public String addProduct(@RequestBody Product product);
	
	@GetMapping("/products")
	@LoadBalanced
	public List<Product> viewAllProducts();
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable Integer id);
	
	@PutMapping("/products/{id}")
	public String updateProduct(@PathVariable Integer id , @RequestBody Product product);
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable Integer id);
	
	
}

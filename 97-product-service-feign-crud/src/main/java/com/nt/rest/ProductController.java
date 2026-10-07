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

import com.nt.service.ProductService;
import com.nt.vo.ProductVO;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService service;

	public ProductController(ProductService service) {
		super();
		this.service = service;
	}
	@PostMapping
	public String addProduct(@RequestBody ProductVO product)
	{
		String msg = service.addProduct(product);
		return msg;
	}
	@GetMapping
	public ResponseEntity<List<ProductVO>> viewAllProducts()
	{
		List<ProductVO> viewAllProducts = service.viewAllProducts();
		return new ResponseEntity<List<ProductVO>>(viewAllProducts,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<ProductVO> getProductById(@PathVariable Integer id)
	{
		ProductVO product = service.getProductById(id);
		return new ResponseEntity<ProductVO>(product,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public String updateProduct(@PathVariable Integer id,
			                    @RequestBody ProductVO vo)
	{
		String updateProduct = service.updateProduct(id, vo);
		return updateProduct;
	}
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Integer id)
			
	{
		String deleteProduct = service.deleteProduct(id);
		return deleteProduct;
	}
	
	
}

package com.nt.services;

import org.springframework.data.domain.Page;

import com.nt.entity.Product;

public interface IProductService {
	public void addProduct(Product product);
	public Product getProduct(int id);
	 public Page<Product> getProductsByPage(int pageNo);
	 public Page<Product> getProductsSorted(int pageNo,String direction);
	 

}

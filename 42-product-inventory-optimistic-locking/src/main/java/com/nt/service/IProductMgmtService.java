package com.nt.service;

import java.util.List;

import com.nt.entity.Product;

public interface IProductMgmtService {
	
	String addMultipleProducts(List<Product> products);
	
	Product findProductById(Integer id);
	
	String  updateProduct(int id,int quantity,double price);
	
	List<Product> viewAllProducts();

}

package com.nt.service;

import java.util.List;

import com.nt.vo.ProductVO;

public interface ProductService {

	String addProduct(ProductVO product);
	List<ProductVO> viewAllProducts();
	ProductVO getProductById(Integer id);
	
	String updateProduct(Integer id,ProductVO product);
	String deleteProduct(Integer id);
	
}

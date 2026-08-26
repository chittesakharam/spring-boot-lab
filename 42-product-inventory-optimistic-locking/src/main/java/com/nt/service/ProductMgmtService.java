package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repository.IProductRepository;

@Service
public class ProductMgmtService implements IProductMgmtService {
	private final IProductRepository repo;

	ProductMgmtService(IProductRepository repo) {
		this.repo = repo;
	}
	@Override
	public String addMultipleProducts(List<Product> products) {
		 int size = repo.saveAll(products).size();
		return size+" Products Added successfully";
	}

	@Override
	public Product findProductById(Integer id) {
		Product p = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id "));
		return p;
	}

	@Override
	public String updateProduct(int id, int quantity, double price) {
		Product p = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id "));
		p.setPrice(price);
		p.setQuantity(quantity);
		repo.save(p);
		return id+" Product Updated";
	}

	@Override
	public List<Product> viewAllProducts() {
		
		return repo.findAll();
	}

}

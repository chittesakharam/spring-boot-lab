package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repository.ProductRepository;
import com.nt.vo.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository repo;
	
	public ProductServiceImpl(ProductRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addProduct(ProductVO product) {
		Product entity = new Product();
		BeanUtils.copyProperties(product, entity,"id");
		Integer id = repo.save(entity).getId();
		return "Product Added with id:: "+id;
	}

	@Override
	public List<ProductVO> viewAllProducts() {
		List<ProductVO> list = repo.findAll().stream().map(e->{
			ProductVO vo = new ProductVO();
			BeanUtils.copyProperties(e, vo);
			return vo;
		}).toList();
		return list;
	}

	@Override
	public ProductVO getProductById(Integer id) {
		Product product = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		ProductVO vo = new ProductVO();
		BeanUtils.copyProperties(product, vo);
		return vo;
	}

	@Override
	public String updateProduct(Integer id, ProductVO product) {
		Product entity = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		 BeanUtils.copyProperties(product, entity);
		 repo.save(entity);
		return  id+" Proudct Updated.." ;
	}

	@Override
	public String deleteProduct(Integer id) {
		Product product = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		 repo.delete(product);
		return id+" Product Deleted";
	}

}

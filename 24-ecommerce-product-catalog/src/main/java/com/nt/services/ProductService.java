package com.nt.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repository.IProductRepository;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository repository;

    
    public void addProduct(Product product) {
        repository.save(product);
    }

   
    public Product getProduct(int id) {
        Optional<Product> opt = repository.findById(id);
        return opt.orElse(null);
    }

    
    public Page<Product> getProductsByPage(int pageNo) {

        Pageable pageable =
                PageRequest.of(pageNo, 5);

        return repository.findAll(pageable);
    }

   
    public Page<Product> getProductsSorted(int pageNo,String direction) {

        Sort sort;

        if(direction.equalsIgnoreCase("DESC")) {
            sort = Sort.by("price").descending();
        } else {
            sort = Sort.by("price").ascending();
        }

        Pageable pageable =
                PageRequest.of(pageNo, 5, sort);

        return repository.findAll(pageable);
    }
}
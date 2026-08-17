package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Product;

public interface IProductRepository extends PagingAndSortingRepository<Product, Integer>,CrudRepository<Product, Integer> {

}

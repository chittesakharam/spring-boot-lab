package com.nt.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Medicine;

public interface IMedicineRepository extends JpaRepository<Medicine, Integer> {

    List<Medicine> findByCategory(String category);

    List<Medicine> findByManufacturer(String manufacturer);

    List<Medicine> findByStockQuantityGreaterThan(Integer quantity);

}

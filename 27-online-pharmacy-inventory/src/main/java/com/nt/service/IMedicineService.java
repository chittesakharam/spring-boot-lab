package com.nt.service;

import java.time.LocalDate;
import java.util.List;

import com.nt.entity.Medicine;

public interface IMedicineService {
	
public List<Medicine> findByCategoryOrManufacturer(String category,String manufacturer);
	
	List<Medicine> findByPriceBeetween(Double minPrice,Double maxPrice);
	
	List<Medicine> findByStockQuantityBetween(Integer minStock, Integer maxStock);
	List<Medicine> findByMedicineNameOrCategory(String medicineName, String category);
	List<Medicine> findByExpiryDateBetween(LocalDate startDate, LocalDate endDate);
	List<Medicine> findByRatingBetween(Double minRating, Double maxRating);
	List<Medicine> findByManufacturerOrCategory(String manufacturer, String category);
	List<Medicine> findByMedicineIdBetween(Long startId, Long endId);

}

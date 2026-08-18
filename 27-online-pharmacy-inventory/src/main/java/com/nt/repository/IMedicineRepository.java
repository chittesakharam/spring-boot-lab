package com.nt.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.nt.entity.Medicine;

@Repository
@EnableJpaRepositories
public interface IMedicineRepository extends JpaRepository<Medicine, Long> {
	
	public List<Medicine> findByCategoryOrManufacturer(String category,String manufacturer);
	
	List<Medicine> findByPriceBeetween(Double minPrice,Double maxPrice);
	
	List<Medicine> findByStockQuantityBetween(Integer minStock, Integer maxStock);
	List<Medicine> findByMedicineNameOrCategory(String medicineName, String category);
	List<Medicine> findByExpiryDateBetween(LocalDate startDate, LocalDate endDate);
	List<Medicine> findByRatingBetween(Double minRating, Double maxRating);
	List<Medicine> findByManufacturerOrCategory(String manufacturer, String category);
	List<Medicine> findByMedicineIdBetween(Long startId, Long endId);

}

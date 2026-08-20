package com.nt.service;



import java.util.List;

import com.nt.entity.Medicine;

public interface IMedicineService {

    Medicine addMedicine(Medicine medicine);

    List<Medicine> viewAllMedicines();

    List<Medicine> searchByCategory(String category);

    List<Medicine> searchByManufacturer(String manufacturer);

    List<Medicine> searchByStockQuantityGreaterThan(Integer quantity);

    void deleteMedicine(Integer medicineId);

}
package com.nt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Medicine;
import com.nt.repository.IMedicineRepository;

@Service
public class MedicineServiceImp implements IMedicineService {

    @Autowired
    private IMedicineRepository repository;

    @Override
    public Medicine addMedicine(Medicine medicine) {
        return repository.save(medicine);
    }

    @Override
    public List<Medicine> viewAllMedicines() {
        return repository.findAll();
    }

    @Override
    public List<Medicine> searchByCategory(String category) {
        return repository.findByCategory(category);
    }

    @Override
    public List<Medicine> searchByManufacturer(String manufacturer) {
        return repository.findByManufacturer(manufacturer);
    }

    @Override
    public List<Medicine> searchByStockQuantityGreaterThan(Integer quantity) {
        return repository.findByStockQuantityGreaterThan(quantity);
    }

    @Override
    public void deleteMedicine(Integer medicineId) {
        repository.deleteById(medicineId);
    }
}
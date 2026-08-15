package com.nt.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Patient;

public interface IPatientRepository extends PagingAndSortingRepository<Patient,Integer> {

}

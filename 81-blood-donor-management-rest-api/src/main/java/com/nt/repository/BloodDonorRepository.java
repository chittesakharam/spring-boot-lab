package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.BloodDonor;

public interface BloodDonorRepository extends JpaRepository<BloodDonor, Long> {

}

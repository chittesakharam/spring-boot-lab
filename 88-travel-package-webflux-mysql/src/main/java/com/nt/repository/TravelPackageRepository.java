package com.nt.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.nt.entity.TravelPackage;

public interface TravelPackageRepository extends ReactiveCrudRepository<TravelPackage, Integer> {

}

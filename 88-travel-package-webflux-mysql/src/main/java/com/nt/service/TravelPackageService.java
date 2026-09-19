package com.nt.service;

import com.nt.entity.TravelPackage;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TravelPackageService {
	
	Mono<String> createTravelPackage(TravelPackage newPackage);
	Flux<TravelPackage> viewAllTravelPackages();
	Mono<TravelPackage> getTravelPackageById(Integer id);
	 Mono<TravelPackage> updateTravelPackage(Integer id,TravelPackage uPackage);
	Mono<String> deletePackage(Integer id);

}

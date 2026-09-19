package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.TravelPackage;
import com.nt.repository.TravelPackageRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TravelPackageServiceImpl implements TravelPackageService {

	private final TravelPackageRepository repo;
	
	public TravelPackageServiceImpl(TravelPackageRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Mono<String> createTravelPackage(TravelPackage newPackage) {
	    return repo.save(newPackage)
	        .map(savedPackage -> "Package Created :: " + savedPackage.getPackageId()); 
	        // Or you can use savedPackage.toString() if TravelPackage has a custom toString() method
	}
	@Override
	public Flux<TravelPackage> viewAllTravelPackages() {
		Flux<TravelPackage> switchIfEmpty = repo.findAll().switchIfEmpty(Flux.empty());
		return switchIfEmpty;
	}
	
	@Override
	public Mono<TravelPackage> getTravelPackageById(Integer id) {
		   
		return repo.findById(id);
	}

	@Override
	public Mono<TravelPackage> updateTravelPackage(Integer id, TravelPackage uPackage) {
	    return repo.findById(id)
	        .flatMap(obj -> {
	            // Ignore the "id" so we don't accidentally overwrite the primary key
	            BeanUtils.copyProperties(uPackage, obj, "packageId");
	            return repo.save(obj);
	        })
	        .switchIfEmpty(Mono.error(new RuntimeException("Travel Package Not found for update")));
	}
	
	public Mono<String> deletePackage(Integer id) {
	    return repo.findById(id)
	        .flatMap(existingPackage -> {
	            // delete() returns Mono<Void>. 
	            // .then() allows us to return a Mono<String> once the deletion completes.
	            return repo.delete(existingPackage)
	                       .then(Mono.just("Travel Package deleted successfully"));
	        })
	        .switchIfEmpty(Mono.error(new RuntimeException("Travel Package not found for deletion")));
	}
}

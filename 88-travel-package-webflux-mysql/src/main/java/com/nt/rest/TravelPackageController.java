package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.TravelPackage;
import com.nt.service.TravelPackageService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/travel-packages")
public class TravelPackageController {

	private final TravelPackageService service;
	
	public TravelPackageController(TravelPackageService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Mono<String>> createPackage(@RequestBody TravelPackage newPackage)
	{
		Mono<String> travelPackage = service.createTravelPackage(newPackage);
		return new ResponseEntity<Mono<String>>(travelPackage,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<Flux<TravelPackage>> viewAllTravelPackages()
	{
		Flux<TravelPackage> viewAllTravelPackages = service.viewAllTravelPackages();
		return new ResponseEntity<Flux<TravelPackage>>(viewAllTravelPackages,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Mono<TravelPackage>> getTravelPackageById(@PathVariable Integer id)
	{
		Mono<TravelPackage> travelPackageById = service.getTravelPackageById(id);
		return new ResponseEntity<Mono<TravelPackage>>(travelPackageById,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Mono<TravelPackage>> updateTravelPackage(@PathVariable Integer id,@RequestBody TravelPackage newPackage)
	{
		Mono<TravelPackage> updateTravelPackage = service.updateTravelPackage(id, newPackage);
		return new ResponseEntity<Mono<TravelPackage>>(updateTravelPackage,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Mono<String>> deleteTravelPackageById(@PathVariable Integer id)
	{
		Mono<String> deletePackage = service.deletePackage(id);
		return new ResponseEntity<Mono<String>>(deletePackage,HttpStatus.OK);
	}
}

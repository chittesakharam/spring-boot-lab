package com.nt.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.BloodDonorService;
import com.nt.vo.BloodDonorVO;

@RestController
@RequestMapping("/donors")
public class BloodDonorController {
	private final BloodDonorService service;

	BloodDonorController(BloodDonorService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<String> registerDonor(@RequestBody BloodDonorVO donor)
	{
		String registerDonor = service.registerDonor(donor);
		return new ResponseEntity<String>(registerDonor,HttpStatusCode.valueOf(200));
	}
	@GetMapping
	public ResponseEntity<?> viewAllDonor()
	{
		List<BloodDonorVO> viewAllDonors = service.viewAllDonors();
		return new ResponseEntity<List<BloodDonorVO>>(viewAllDonors,HttpStatusCode.valueOf(200));
	}
	@GetMapping("/{id}")
	public ResponseEntity<BloodDonorVO> getDonorById(@PathVariable Long id)
	{
		BloodDonorVO donor = service.getDonorById(id);
		return new ResponseEntity<BloodDonorVO>(donor,HttpStatusCode.valueOf(200));
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> updateDonor(@PathVariable Long id, @RequestBody BloodDonorVO donor)
	{
		String updateDonor = service.updateDonor(id, donor);
		return new ResponseEntity<String>(updateDonor,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDonor(@PathVariable Long id)
	{
		String deleteDonor = service.deleteDonor(id);
		return new ResponseEntity<String>(deleteDonor,HttpStatusCode.valueOf(200));
	}

}

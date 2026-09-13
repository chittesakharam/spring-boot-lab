package com.nt.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.SmartLockerService;
import com.nt.vo.SmartLockerVO;

@RestController
@RequestMapping("/lockers")
public class SmartLockerController {
	
	private final SmartLockerService service;
	
	
	public SmartLockerController(SmartLockerService service) {
		super();
		this.service = service;
	}


	@PostMapping
	public ResponseEntity<String> addLocker(@RequestBody SmartLockerVO locker)
	{
		String createMsg = service.createLocker(locker);
		return new ResponseEntity<String>(createMsg,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<SmartLockerVO>> viewAllLockers()
	{
		List<SmartLockerVO> viewAllLockers = service.viewAllLockers();
		return new ResponseEntity<List<SmartLockerVO>>(viewAllLockers,HttpStatus.OK);
	}
	
	@PostMapping("/saveAll")
	public ResponseEntity<String> createMultipleLockers(@RequestBody List<SmartLockerVO> list)
	{
		String multileLocker = service.createMultileLocker(list);
		return new ResponseEntity<String>(multileLocker,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<SmartLockerVO> getLockerById(@PathVariable Long id)
	{
		SmartLockerVO locker = service.getLockerById(id);
		return new ResponseEntity<SmartLockerVO>(locker,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateLocker(@PathVariable Long id, @RequestBody SmartLockerVO locker)
	{
		String updateLocker = service.updateLocker(id, locker);
		return new ResponseEntity<String>(updateLocker,HttpStatus.OK);
	}
	@PatchMapping("/{id}")
	public ResponseEntity<String> updateLockerSpecificField(@PathVariable Long id, @RequestBody SmartLockerVO locker)
	{
		String updateSpecificFields = service.updateSpecificFields(id, locker);
		return new ResponseEntity<String>(updateSpecificFields,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> addLocker(@PathVariable Long id)
	{
		String deleteLockerById = service.deleteLockerById(id);
		return new ResponseEntity<String>(deleteLockerById,HttpStatus.OK);
	}
	

}

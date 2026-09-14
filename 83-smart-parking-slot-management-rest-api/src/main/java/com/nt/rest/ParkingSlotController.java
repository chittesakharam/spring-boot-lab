package com.nt.rest;

import java.util.List;

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

import com.nt.service.ParkingSlotService;
import com.nt.vo.ParkingSlotVO;

@RestController
@RequestMapping("api/parking-slots")
public class ParkingSlotController {

	private final ParkingSlotService service;
	
	
	public ParkingSlotController(ParkingSlotService service) {
		super();
		this.service = service;
	}


	@PostMapping
	public ResponseEntity<String> createParkingSlot(@RequestBody ParkingSlotVO slot)
	{
		String parkingSlot = service.createParkingSlot(slot);
		return new ResponseEntity<String>(parkingSlot,HttpStatus.OK);
	}
	@PostMapping("/saveAll")
	public ResponseEntity<String> createMulitpleParkingSlots(@RequestBody List<ParkingSlotVO> slots)
	{
		String multipleSlots = service.createMultipleSlots(slots);
		return new ResponseEntity<String>(multipleSlots,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<ParkingSlotVO>> viewAllParkingSlots()
	{
		List<ParkingSlotVO> viewAllParkingSlots = service.viewAllParkingSlots();
		return new ResponseEntity<List<ParkingSlotVO>>(viewAllParkingSlots,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ParkingSlotVO> getParkingSlotById(@PathVariable Long id)
	{
		ParkingSlotVO parkingSlotById = service.getParkingSlotById(id);
		return new ResponseEntity<ParkingSlotVO>(parkingSlotById,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> UpdateParkingSlot(@RequestBody ParkingSlotVO slot, @PathVariable Long id)
	{
		String updateParkingSlot = service.updateParkingSlot(id, slot);
		return new ResponseEntity<String>(updateParkingSlot,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteParkingSlot(@PathVariable Long id)
	{
		String deleteParkingSlot = service.deleteParkingSlot(id);
		return new ResponseEntity<String>(deleteParkingSlot,HttpStatus.OK);
	}
	
	
}

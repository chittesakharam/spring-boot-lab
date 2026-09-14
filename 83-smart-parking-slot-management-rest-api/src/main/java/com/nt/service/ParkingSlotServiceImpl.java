package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.ParkingSlot;
import com.nt.exception.ParkingSlotNotFoundException;
import com.nt.repository.ParkingSlotRepository;
import com.nt.vo.ParkingSlotVO;

@Service
public class ParkingSlotServiceImpl implements ParkingSlotService {

	private final ParkingSlotRepository repo;
	
	public ParkingSlotServiceImpl(ParkingSlotRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String createParkingSlot(ParkingSlotVO slot) {
		ParkingSlot entity = new ParkingSlot();
		BeanUtils.copyProperties(slot, entity);
		Long id = repo.save(entity).getSlotId();
		return "Parking Slot Created with id : "+ id;
	}

	@Override
	public List<ParkingSlotVO> viewAllParkingSlots() {
	     List<ParkingSlotVO> list = repo.findAll().stream().map(entity->{
	    	 ParkingSlotVO vo = new ParkingSlotVO();
	    	 BeanUtils.copyProperties(entity, vo);
	    	 return vo;
	     }).toList();
	     
		return list;
	}

	@Override
	public ParkingSlotVO getParkingSlotById(Long id) {
		ParkingSlot byId = findById(id);
		ParkingSlotVO vo = new ParkingSlotVO();
		BeanUtils.copyProperties(byId, vo);
		
		return vo;
	}

	@Override
	public String updateParkingSlot(Long id, ParkingSlotVO slot) {
		ParkingSlot entity = findById(id);
		BeanUtils.copyProperties(slot, entity);
		repo.save(entity);
		return id+" Parking Slot is Updated";
	}

	@Override
	public String deleteParkingSlot(Long id) {
		ParkingSlot entity = findById(id);
		repo.delete(entity);
		return id+" Parking Slot is Deleted";
	}
	private ParkingSlot findById(Long id)
	{
		ParkingSlot slot = repo.findById(id).orElseThrow(()->new ParkingSlotNotFoundException("Invalid Id") );
		
		return slot;
	}
	
	@Override
	public String createMultipleSlots(List<ParkingSlotVO> list) {
		List<ParkingSlot> slots = list.stream().map(vo->{
			ParkingSlot entity = new ParkingSlot();
			BeanUtils.copyProperties(vo, entity);
			return entity;
		}).toList();
		
		List<Long> ids = repo.saveAll(slots).stream().map(ParkingSlot::getSlotId).toList();
		return ids.size()+" Parking Slots are Created with ids "+ids;
	}

}

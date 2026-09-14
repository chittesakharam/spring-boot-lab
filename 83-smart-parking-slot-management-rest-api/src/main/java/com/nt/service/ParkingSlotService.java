package com.nt.service;

import java.util.List;

import com.nt.vo.ParkingSlotVO;

public interface ParkingSlotService {
	
    String createParkingSlot(ParkingSlotVO slot);
    List<ParkingSlotVO> viewAllParkingSlots();
    ParkingSlotVO getParkingSlotById(Long id);
    String updateParkingSlot(Long id,ParkingSlotVO slot);
    String deleteParkingSlot(Long id);
    String createMultipleSlots(List<ParkingSlotVO> list);

}

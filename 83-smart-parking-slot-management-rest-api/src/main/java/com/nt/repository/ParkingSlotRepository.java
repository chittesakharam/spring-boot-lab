package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.ParkingSlot;

public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {

}

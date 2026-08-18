package com.nt.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Booking;
import com.nt.repository.IBookingRepository;
@Component
public class BookingServices implements IBookingServices {
	@Autowired
    private IBookingRepository repo;
	@Override
	public List<Booking> findByCityOrRoom(String city, String roomType) {
		
		return repo.findByCityOrRoomType(city, roomType);
	}

	@Override
	public List<Booking> findByBookingAmountBetween(Double minAmount, Double maxAmount) {
		
		return repo.findByBookingAmountBetween(minAmount, maxAmount);
	}

	@Override
	public List<Booking> findByNumberOfDaysBetween(Integer minDays, Integer maxDays) {
		
		return repo.findByNumberOfDaysBetween(minDays, maxDays);
	}

	@Override
	public List<Booking> findByBookingStatusOrCity(String status, String city) {
		
		return repo.findByBookingStatusOrCity(status, city);
	}

	@Override
	public List<Booking> findByBookingDateBetween(LocalDate startDate, LocalDate endDate) {
		
		return repo.findByBookingDateBetween(startDate, endDate);
	}

	@Override
	public List<Booking> findByGuestNameOrBookingStatus(String guestName, String status) {
		
		return repo.findByGuestNameOrBookingStatus(guestName, status);
	}

	@Override
	public List<Booking> findByRoomTypeOrBookingStatus(String roomType, String status) {
		
		return repo.findByRoomTypeOrBookingStatus(roomType, status);
	}

	@Override
	public List<Booking> findByBookingIdBetween(Long startId, Long endId) {
		
		return repo.findByBookingIdBetween(startId, endId);
	}

}

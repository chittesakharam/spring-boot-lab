package com.nt.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("dRequest")
public class DroneRentalRequest {

	private Integer requestId;
	private String customerName;
	private String droneModel;
	private String rentalPurpose;
	private String rentalDuration;
	private Long contactNumber;
	private String pickupLocation;
	
	
}

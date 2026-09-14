package com.nt.vo;

import lombok.Data;

@Data
public class ParkingSlotVO {

	private Long slotId;
	private String slotCode;
	private Integer floorNumber;
	private String vehicleType;
	private Double hourlyRate;
	private Boolean available;
}

package com.nt.vo;

import lombok.Data;

@Data
public class SmartLockerVO {

	private Long lockerId;
	private String lockerCode;
	private String location;
	private String lockerSize;
	private Boolean isAvailable;
	private Double hourlyRate;
}

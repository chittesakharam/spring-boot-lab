package com.nt.exception;

public class ParkingSlotNotFoundException extends RuntimeException {

	public ParkingSlotNotFoundException() {
		super();
	}
	public ParkingSlotNotFoundException(String msg) {
		super(msg);
	}
	
	

}

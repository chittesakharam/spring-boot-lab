package com.nt.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city;
	private String state;
	private Integer pincode;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
}

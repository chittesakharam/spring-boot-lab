package com.nt.model;

import org.springframework.beans.factory.annotation.Value;

public class CustomerService {

	@Value("${customerId}")
	private Integer customerId;
	@Value("${customerName}")
	private String customerName;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}

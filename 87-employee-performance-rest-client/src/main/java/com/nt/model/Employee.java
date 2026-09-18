package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	
	private Long employeeId;
	private String employeeName;
	private String department;
	private Double salary;
	private String designation;

}

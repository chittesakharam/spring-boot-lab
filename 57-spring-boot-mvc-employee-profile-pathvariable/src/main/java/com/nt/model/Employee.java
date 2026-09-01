package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
	
	private Integer empId;
	private String empName;
	private String dept;
	private String designation;
	private Double Salary;

}

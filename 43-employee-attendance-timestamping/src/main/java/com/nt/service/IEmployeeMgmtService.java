package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {
	
	String addEmployee(Employee emp);
	
	String updateEmployeeDetails(int id,String dept,Double salary);
	
	List<Employee> viewAllEmployee();

}

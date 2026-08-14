package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeServices {
	
	List<Employee> getEmployeesByPage(int pageNumber, int pageSize);

    List<Employee> getEmployeesSortedBySalary();

    List<Employee> getEmployeesSortedByName();


}

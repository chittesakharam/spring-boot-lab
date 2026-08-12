package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeService {

	String saveEmployee(Employee emp);
	String saveAllEmployee(List<Employee> list);
	Iterable<Employee> displayAllEmployee();
}

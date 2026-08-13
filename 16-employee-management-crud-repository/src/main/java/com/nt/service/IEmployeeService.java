package com.nt.service;

import com.nt.entity.Employee;

public interface IEmployeeService {

	public String addEmployee(Employee emp);
	public String addAllEmployee(Iterable<Employee> list);
	public String showEmpById(int id);
	public Iterable<Employee> showAllEmployee();
	public String checkEmpById(int id);
	public int checkEmpTotalCount();
	public String updateEmpDetails(Employee emp);
	public String deleteEmpById(int id);
	public String deleteEmpRecord(Employee emp);
	public String deleteMultipleRecord(Iterable<Integer> ids);
	public String deleteAllEmployee();
	
	
}

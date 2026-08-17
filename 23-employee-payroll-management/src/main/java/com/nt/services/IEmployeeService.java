package com.nt.services;

import com.nt.entity.Employee;

public interface IEmployeeService {
	public void addEmployee(Employee emp) ;
	public void viewAllEmployees();
	public void searchEmployee(Integer id);
	 public void updateEmployee(Integer id, double salary,double bonus, String designation) ;
	public void deleteEmployee(Integer id);
}

package com.nt.service;

import java.util.List;

import com.nt.vo.Employee;

public interface IEmployeeSkillServices {
	
	public String addEmployee(Employee emp);
	
	public List<Employee> showAllEmployee();

}

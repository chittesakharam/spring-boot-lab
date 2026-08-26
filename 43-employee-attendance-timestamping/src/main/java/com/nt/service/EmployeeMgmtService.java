package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

public class EmployeeMgmtService implements IEmployeeMgmtService {

	private IEmployeeRepository repo;
	@Override
	public String addEmployee(Employee emp) {
		Integer id = repo.save(emp).getEmployeeId();
		return id+" Id With Employee Added";
	}

	@Override
	public String updateEmployeeDetails(int id,String dept,Double salary) {
		 Employee employee = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id "));
		 employee.setDepartment(dept);
		 employee.setSalary(salary);
		 repo.save(employee);
		return id+" Updated successfully";
	}

	@Override
	public List<Employee> viewAllEmployee() {
		
		return repo.findAll();
	}

}

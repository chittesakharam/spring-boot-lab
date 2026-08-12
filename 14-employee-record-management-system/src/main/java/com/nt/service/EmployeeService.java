package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
      private EmployeeRepository empRepo;
	@Override
	public String saveEmployee(Employee emp) {
		if(emp.getEmployeeName().equals(""))
			throw new IllegalArgumentException("Name Can not be null ");
		  empRepo.save(emp);
		return "Employee Add successfully";
	}

	@Override
	public String saveAllEmployee(List<Employee> list) {
		int c= list.size();
		for(Employee e : list)
		{
			if(e.getEmployeeName().equals(""))
				throw new IllegalArgumentException();
		}
		   empRepo.saveAll(list);
		return c+" Employee Added Successfully";
	}

	@Override
	public Iterable<Employee> displayAllEmployee() {
		     Iterable<Employee> all = empRepo.findAll();
		return all;
	}

	
	

}

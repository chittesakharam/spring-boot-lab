package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
      private IEmployeeService  service;
	
	@Override
	public void run(String... args) throws Exception {
		
		String saveEmployee = service.saveEmployee(new Employee(101,"Smith","IT",40000.0));
		
		IO.println(saveEmployee);
		Employee e1 = new Employee(102,"Blake","Manager",50000.0);
	    Employee e2 = new Employee(103,"John","Clerk",30000.0);
		Employee e3 = new Employee(104,"Miller","HR",80000.0);
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		  String saveAllEmployee = service.saveAllEmployee(list);
		  
		  IO.println(saveAllEmployee);
		  
		  Iterable<Employee> displayAllEmployee = service.displayAllEmployee();
		  displayAllEmployee.forEach(emp-> IO.println(emp));

	}

}

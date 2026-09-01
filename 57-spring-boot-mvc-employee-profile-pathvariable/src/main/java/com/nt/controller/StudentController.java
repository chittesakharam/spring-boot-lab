package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.model.Employee;


@Controller
public class StudentController {

	 List<Employee> list = new ArrayList<>();
	 
	 
	
	public StudentController() {
		super();
		list.add(new Employee(101,"Sakharam","IT","Developer",40000.0));
		list.add(new Employee(102,"Mahesh","IT","Developer",60000.0));
	}
	@GetMapping("/")
	public String showHomePage()
	{
		return "home";
	}
	@GetMapping("/employee/{employeeId}")
	public String showEmployeeDetails(Map<String,Object> map,@PathVariable Integer employeeId)
	{
		List<Employee> list2 = list.stream().filter(e -> e.getEmpId().equals(employeeId)).toList();
		Employee employee = list2.get(0);
		map.put("e", employee);
		return "employee";
	}
	
	
}

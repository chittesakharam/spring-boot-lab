package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Component
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	public void addEmployee(Employee emp)
	{
		String employee = service.addEmployee(emp);
		IO.println(employee);
	}
	public void addAllEmployee(Iterable<Employee> list)
	{
		String allEmployee = service.addAllEmployee(list);
		IO.println(allEmployee);
	}
	public void showEmpById(int id)
	{
		String showEmpById = service.showEmpById(id);
		IO.println(showEmpById);
	}
	public void showAllEmployee()
	{
		Iterable<Employee> showAllEmployee = service.showAllEmployee();
		showAllEmployee.forEach(emp-> IO.println(emp));
	}
	public void checkEmpById(int id)
	{
		String checkEmpById = service.checkEmpById(id);
		IO.println(checkEmpById);
	}
	public void checkEmpTotalCount()
	{
		int checkEmpTotalCount = service.checkEmpTotalCount();
		IO.println(checkEmpTotalCount);
	}
	public void updateEmpDetails(Employee emp)
	{
		String updateEmpDetails = service.updateEmpDetails(emp);
		IO.println(updateEmpDetails);
	}
	public void deleteEmpById(int id)
	{
		String msg = service.deleteEmpById(id);
		IO.println(msg);
	}
	public void deleteEmpRecord(Employee emp)
	{
		String deleteEmpRecord = service.deleteEmpRecord(emp);
		IO.println(deleteEmpRecord);
	}
	public void deleteMultipleRecord(Iterable<Integer> ids)
	{
		String deleteMultipleRecord = service.deleteMultipleRecord(ids);
		IO.println(deleteMultipleRecord);
	}
	public void deleteAllEmployee()
	{
		String deleteAllEmployee = service.deleteAllEmployee();
		IO.println(deleteAllEmployee);
		
	}
	

}

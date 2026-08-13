package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeRepository repo;

	@Override
	public String addEmployee(Employee emp) {
		  repo.save(emp);
		return "Saved Employee successfully"+emp.getEmployeeName();
	}

	@Override
	public String addAllEmployee(Iterable<Employee> list) {
		  repo.saveAll(list);
		  
		return "All Employee Added Successfully";
	}

	@Override
	public String showEmpById(int id) {
		if(repo.existsById(id)) {
		   Employee employee = repo.findById(id).get();
		return employee+"";
		}
		else
			return "Employee Not Found ";
	}

	@Override
	public Iterable<Employee> showAllEmployee() {
		  Iterable<Employee> all = repo.findAll();
		return all;
	}

	@Override
	public String checkEmpById(int id) {
		  boolean existsById = repo.existsById(id);
		return existsById?"Empoyee Available":"Employee Not found" ;
	}

	@Override
	public int checkEmpTotalCount() {
		  long count = repo.count();
		return (int)count;
	}

	@Override
	public String updateEmpDetails(Employee emp) {
		  Employee employee = repo.findById(emp.getEmployeeId()).get();
		  employee.setSalary(emp.getSalary());
		  employee.setDepartment(emp.getDepartment());
		  Employee save = repo.save(employee);
		return save+" Details Successfully";
	}

	@Override
	public String deleteEmpById(int id) {
		    boolean existsById = repo.existsById(id);
		    if(existsById)
		    {
		    	repo.deleteById(id);
		    	return "Employee Deleted Successfully..";
		    }
		    	else
		    	 return "Employee Not Found";
		    
		
	}

	@Override
	public String deleteEmpRecord(Employee emp) {
		if(repo.existsById(emp.getEmployeeId())) {
		repo.delete(emp);
		return "Employee Deleted Successfully"+emp;
		}
		return "Employee Record not found"+emp;
	}

	@Override
	public String deleteMultipleRecord(Iterable<Integer> ids) {
		   
		  repo.deleteAllById(ids);
		 
		 
		return "Employee Deleted Successfully";
	}

	@Override
	public String deleteAllEmployee() {
		repo.deleteAll();
		return "All Employee delete Successfully";
	}

}

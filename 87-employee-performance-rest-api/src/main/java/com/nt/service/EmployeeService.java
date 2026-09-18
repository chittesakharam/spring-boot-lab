package com.nt.service;

import java.util.List;

import com.nt.vo.EmployeeVO;

public interface EmployeeService {
	
	String addEmployee(EmployeeVO emp);
	List<EmployeeVO> viewAllEmployee();
	EmployeeVO getEmployeeById(Long id);
	String updateEmployee(Long id,EmployeeVO emp);
	String deleteEmployee(Long id);

}

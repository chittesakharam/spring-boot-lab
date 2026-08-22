package com.nt.service;

import java.util.List;

import com.nt.entity.EmployeeResume;

public interface IEmployeeMgmtService {
	
	String addEmployeeResume(EmployeeResume er);
	EmployeeResume showResumeById(Long id);
	List<EmployeeResume> showAllEmployee();
	String deleteResume();

}

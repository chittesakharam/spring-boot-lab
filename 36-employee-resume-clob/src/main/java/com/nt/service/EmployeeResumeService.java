package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeResume;
import com.nt.repository.EmployeeResumeRepository;

@Service
public class EmployeeResumeService implements IEmployeeMgmtService {

	@Autowired
	private EmployeeResumeRepository repo;
	@Override
	public String addEmployeeResume(EmployeeResume er) {
		  Long id = repo.save(er).getEmployeeId();
		return id+" id employee Resume Added";
	}

	@Override
	public EmployeeResume showResumeById(Long id) {
		return repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid ID"));
		
	}

	@Override
	public List<EmployeeResume> showAllEmployee() {
		
		return repo.findAll();
	}

	@Override
	public String deleteResume() {
		int size = repo.findAll().size();
		repo.deleteAll();
		return size+" Employees Resumes are deleted";
	}

}

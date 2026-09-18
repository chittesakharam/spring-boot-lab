package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;
import com.nt.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository repo;
	
	
	public EmployeeServiceImpl(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addEmployee(EmployeeVO emp) {
	   Employee entity = new Employee();
	   BeanUtils.copyProperties(emp, entity);
	   Long id = repo.save(entity).getEmployeeId();
	   return "Employee Added with id value:: "+id;
	}

	@Override
	public List<EmployeeVO> viewAllEmployee() {
		 List<EmployeeVO> list = repo.findAll().stream().map(entity->{
			 EmployeeVO vo  = new EmployeeVO();
			 BeanUtils.copyProperties(entity, vo);
			 return vo;
		 }).toList();
		return list;
	}

	@Override
	public EmployeeVO getEmployeeById(Long id) {
		  Employee entity = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		  EmployeeVO vo = new EmployeeVO();
		  BeanUtils.copyProperties(entity, vo);
		  
		return vo;
	}

	@Override
	public String updateEmployee(Long id, EmployeeVO emp) {
		 Employee entity = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		 BeanUtils.copyProperties(emp, entity,"employeeId");
		 repo.save(entity);
		return id+" Employee Updated";
	}

	@Override
	public String deleteEmployee(Long id) {
		 Employee entity = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		 repo.delete(entity);
		return id+" Employee Deleted";
	}

}

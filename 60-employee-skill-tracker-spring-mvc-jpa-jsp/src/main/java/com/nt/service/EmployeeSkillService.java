package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeSkill;
import com.nt.repository.IEmployeeSkillRepository;
import com.nt.vo.Employee;

@Service
public class EmployeeSkillService implements IEmployeeSkillServices {

	@Autowired
	private IEmployeeSkillRepository empRepo;
	@Override
	public String addEmployee(Employee emp) {
		EmployeeSkill employee = new EmployeeSkill();
		BeanUtils.copyProperties(emp, employee);
		empRepo.save(employee);
		return "Employee Add With id :: "+employee.getEmployeeId();
	}

	@Override
	public List<Employee> showAllEmployee() {
			List<EmployeeSkill> all = empRepo.findAll();
			List<Employee> list = new ArrayList<>();
			for(EmployeeSkill e : all)
			{
			  Employee emp = new Employee();
			  BeanUtils.copyProperties(e, emp);
			  list.add(emp);
			}
		return list;
	}

}

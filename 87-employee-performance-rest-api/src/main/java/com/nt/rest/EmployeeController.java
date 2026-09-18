package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private final EmployeeService service;
	
	
	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}


	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeVO emp)
	{
		String addMsg = service.addEmployee(emp);
		return new ResponseEntity<String>(addMsg,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<EmployeeVO>> viewAllEmployee()
	{
		List<EmployeeVO> viewAllEmployee = service.viewAllEmployee();
		return new ResponseEntity<List<EmployeeVO>>(viewAllEmployee,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable Long id)
	{
		EmployeeVO emp = service.getEmployeeById(id);
		return new ResponseEntity<EmployeeVO>(emp,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable Long id ,@RequestBody EmployeeVO emp)
	{
		String updateMsg = service.updateEmployee(id, emp);
		return new ResponseEntity<String>(updateMsg,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id )
	{
		String deleteMsg = service.deleteEmployee(id);
		return new ResponseEntity<String>(deleteMsg,HttpStatus.OK);
	}
	
	

}

package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.service.IEmployeeSkillServices;
import com.nt.vo.Employee;

@Controller
public class EmployeeSkillController {
	@Autowired
	private IEmployeeSkillServices service;
	
	@GetMapping("/")
	public String showHomePage()
	{
		System.out.println("EmployeeSkillController.showHomePage()");
		return "welcome";
	}
	
	@GetMapping("/register")
	public String registerEmployee(@ModelAttribute("emp") Employee emp)
	{
	 System.out.println("EmployeeSkillController.registerEmployee()");	
		return "register";
	}
	
	@PostMapping("/save")
	public String saveEmployee(RedirectAttributes attrs, @ModelAttribute("emp")Employee emp)
	{
		 System.out.println("EmployeeSkillController.saveEmployee()");
	     String msg = service.addEmployee(emp);
	     attrs.addFlashAttribute("resultMsg",msg);
	    
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String viewAllEmployees(Map<String,Object> map)
	{
		
		System.out.println("EmployeeSkillController.viewAllEmployees()");
	     List<Employee> allEmp = service.showAllEmployee();
	     map.put("allEmp", allEmp);
		return "employees";
	}

}

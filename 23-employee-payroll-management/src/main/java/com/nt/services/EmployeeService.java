package com.nt.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeRepository repo;

        public void addEmployee(Employee emp) {
        emp.setNetSalary(emp.getBasicSalary() + emp.getBonus());
        repo.save(emp);
        IO.println("Employee Added Successfully");
    }

        public void viewAllEmployees() {
        repo.findAll().forEach(System.out::println);
    }

    
    public void searchEmployee(Integer id) {

        Optional<Employee> opt = repo.findById(id);

        if(opt.isPresent()) {
            IO.println(opt.get());
        } else {
           IO.println("Employee Not Found");
        }
    }

    
    public void updateEmployee(Integer id, double salary,double bonus, String designation) {

        Optional<Employee> opt = repo.findById(id);

        if(opt.isPresent()) {

            Employee emp = opt.get();

            emp.setBasicSalary(salary);
            emp.setBonus(bonus);
            emp.setDesignation(designation);

            emp.setNetSalary(salary + bonus);

            repo.save(emp);

           IO.println("Employee Updated Successfully");
        }
        else {
            IO.println("Employee Not Found");
        }
    }

    
    public void deleteEmployee(Integer id) {

        if(repo.existsById(id)) {
            repo.deleteById(id);
IO.println("Employee Deleted Successfully");
        }
        else {
            IO.println("Employee Not Found");
        }
    }
}
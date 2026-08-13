package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeeController;
import com.nt.entity.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner{
	@Autowired
	private EmployeeController emp;

	@Override
	public void run(String... args) throws Exception {
		
		IO.println("1. Add Single Employee");
		IO.println("2. Add Multiple Employees");
		IO.println("3. View Employee By Id");
		IO.println("4. View All Employees");
		IO.println("5. Check Employee Exists");
		IO.println("6. Count Total Employees");
		IO.println("7. Update Employee Details");
		IO.println("8. Delete Employee By Id");
		IO.println("9. Delete Employee Record");
		IO.println("10. Delete Multiple Employees");
		IO.println("11. Delete All Employees");
		IO.println("12.Exit");
		
		int choice = Integer.parseInt(IO.readln("Enter Your Choice: "));
		
		switch(choice)
		{
		case 1->{
			int id = Integer.parseInt(IO.readln("Enter Employye ID: "));
			String name= IO.readln("Enter Employee Name: ");
			String department = IO.readln("Enter Department Name: ");
			double sal=Double.parseDouble(IO.readln("Enter Employee Salary: "));
			
			  emp.addEmployee(new Employee(id,name,department,sal));
		}
		
		case 2-> {
			   int n = Integer.parseInt(IO.readln("Enter no of Employee: "));
			    List<Employee> list = new ArrayList<>();
			    for(int i=1;i<=n;i++)
			    {
			    	int id = Integer.parseInt(IO.readln("Enter Employye ID: "));
					String name= IO.readln("Enter Employee Name: ");
					String department = IO.readln("Enter Department Name: ");
					double sal=Double.parseDouble(IO.readln("Enter Employee Salary: "));
					list.add(new Employee(id,name,department,sal));
			    }
			    emp.addAllEmployee(list);
		}
		case 3->{
			int id = Integer.parseInt(IO.readln("Enter Employye ID: "));
			emp.showEmpById(id);
		}
		case 4->emp.showAllEmployee();
		case 5->{
			int id = Integer.parseInt(IO.readln("Enter Employye ID: "));
			emp.checkEmpById(id);
		}
		case 6-> emp.checkEmpTotalCount();
		
		case 7->{
			int id = Integer.parseInt(IO.readln("Enter Employye ID: "));
			String name= IO.readln("Enter Employee Name: ");
			String department = IO.readln("Enter Department Name: ");
			double sal=Double.parseDouble(IO.readln("Enter Employee Salary: "));
			emp.updateEmpDetails(new Employee(id,name,department,sal));
		}
		case 8->{
			int id = Integer.parseInt(IO.readln("Enter Employye ID: "));
			emp.deleteEmpById(id);
		}
		case 9->{
			int id = Integer.parseInt(IO.readln("Enter Employye ID: "));
			String name= IO.readln("Enter Employee Name: ");
			String department = IO.readln("Enter Department Name: ");
			double sal=Double.parseDouble(IO.readln("Enter Employee Salary: "));
			emp.deleteEmpRecord(new Employee(id,name,department,sal));
		}
		case 10->{
			 int n = Integer.parseInt(IO.readln("Enter no of Employee: "));
			    List<Integer> list = new ArrayList<>();
			    for(int i=1;i<=n;i++)
			    {
			    	int id = Integer.parseInt(IO.readln("Enter Employye ID: "));
					
					list.add(id);
			    }
			    emp.deleteMultipleRecord(list);
		}
		case 11->emp.deleteAllEmployee();
		case 12->System.exit(0);
		}
		
		
	}
	

	

}

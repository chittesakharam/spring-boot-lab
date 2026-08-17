package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_exam")
public class Employee {

    @Id
    private Integer employeeId;
    private String employeeName;
    private String department;
    private String designation;
    private Double basicSalary;
    private Double bonus;
    private int exp;
    private double netSalary;

    public Employee() {
    }

	public Employee(Integer employeeId, String employeeName, String department, String designation, Double basicSalary,
			Double bonus,Integer exp) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.designation = designation;
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		this.netSalary = bonus+basicSalary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", designation=" + designation + ", basicSalary=" + basicSalary + ", bonus=" + bonus + ", netSalary="
				+ netSalary + "]";
	}
    
	
    

    
}


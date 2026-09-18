package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emp_id",initialValue =10000001,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long employeeId;
	@Column(length=30)
	private String employeeName;
	@Column(length=30)
	private String department;
	private Double salary;
	@Column(length=30)
	private String designation;
	

}

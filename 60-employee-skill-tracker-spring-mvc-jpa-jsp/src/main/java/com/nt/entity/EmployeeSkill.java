package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee_Skills")
public class EmployeeSkill {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emp_skill_Id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer employeeId;
	@Column(length=30)
	private String employeeName;
	@Column(length=30)
	private String skillName;
	private Integer experience;
	@Column(length=30)
	private String projectName;

}

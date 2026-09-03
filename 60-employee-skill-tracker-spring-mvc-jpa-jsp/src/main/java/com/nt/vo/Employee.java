package com.nt.vo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Component("emp")
public class Employee {
	@Id
	private Integer employeeId;
	private String employeeName;
	private String skillName;
	private Integer experience;
	private String projectName;

}

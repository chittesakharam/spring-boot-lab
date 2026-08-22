package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name="Employee_Resume")
public class EmployeeResume {

	@Id
	private Long employeeId;
	
	@NonNull
	private String employeeName;
	@NonNull
	private String designation;
	@NonNull
	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String resumeContent;
}

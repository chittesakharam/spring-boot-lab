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
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name="Univercity_Courses")
public class Course {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "cId_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy =GenerationType.SEQUENCE)
	private Long courseId;
	@NonNull
    @Column(length=30)
	private String courseName;
	@NonNull
    @Column(length=30)
	private String duration;
	@NonNull
	private Double fee;
	
}

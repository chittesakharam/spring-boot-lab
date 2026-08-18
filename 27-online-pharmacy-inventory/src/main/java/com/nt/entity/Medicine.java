package com.nt.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medicine {

	@Id
	private Long medicineId;
	private String medicineName;
	private String category;
	private String manufacturer;
	private Double price;
	private Integer stockQuantity;
	private LocalDate expiryDate;
}

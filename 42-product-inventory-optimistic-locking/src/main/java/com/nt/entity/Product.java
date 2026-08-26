package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Version_Product")
public class Product {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Cust_Id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer productId;
	@NonNull
	@Column(length=40)
	private String productName;
	@NonNull
	private Double price;
	@NonNull
	private Integer quantity;
	@Version
	private Integer version;

}

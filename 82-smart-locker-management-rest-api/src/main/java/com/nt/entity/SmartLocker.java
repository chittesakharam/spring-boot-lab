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
public class SmartLocker {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "locker_Id",initialValue = 100000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long lockerId;
	@Column(length=100)
	private String lockerCode;
	@Column(length=100)
	private String location;
	@Column(length=100)
	private String lockerSize;
	private Boolean isAvailable;
	private Double hourlyRate;
}

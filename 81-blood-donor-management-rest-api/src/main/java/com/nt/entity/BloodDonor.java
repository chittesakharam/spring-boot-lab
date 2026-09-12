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
public class BloodDonor {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Donor_id",initialValue = 100000000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long donorId;
	@Column(length=30)
	private String donorName;
	@Column(length=5)
	private String bloodGroup;
	@Column(length=30)
	private String city;
	@Column(length=15)
	private String mobileNumber;

}

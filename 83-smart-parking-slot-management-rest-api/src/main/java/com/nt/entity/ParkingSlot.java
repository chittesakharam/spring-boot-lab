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
@Entity
@Data
public class ParkingSlot {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "slot_Id",initialValue = 101,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long slotId;
	@Column(length=30)
	private String slotCode;
	private Integer floorNumber;
	@Column(length=30)
	private String vehicleType;
	private Double hourlyRate;
	private Boolean available;
}

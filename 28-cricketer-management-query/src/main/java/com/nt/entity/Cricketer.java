package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cricketer {
	
	@Id
	private Long id;
	@Column(length=30)
	private String playerName;
	@Column(length=30)
	private String country;
	@Column(length=30)
	private String role;
	@Column(length=30)
	private String team;
	private Double battingAverage;
	private Integer matchesPlayed;
	private Integer centuries;
	private Integer age;
	private Boolean retired;

}

package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
//@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class FootballPlayer {
	@SequenceGenerator(name="gen1",sequenceName ="Plyer_ID",initialValue = 1000, allocationSize =1)
	@GeneratedValue(generator ="gen1",strategy =GenerationType.SEQUENCE)
	@Id
	private Integer playerId;
	@Column(length=30)
	private String playerName;
	@Column(length=30)
	private String country;
	@Column(length=30)
	private String club;
	@Column(length=30)
	private String position;
	private Double salary;
	private Integer jerseyNumber;
	
	
	//Version
	@Version
	private Integer version;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;

}

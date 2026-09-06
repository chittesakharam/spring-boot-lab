package com.nt.entity;

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
public class Cricketer {

	@Id
	@SequenceGenerator(name="gen1",sequenceName ="player_Id",initialValue = 10000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer playerId;
	private String playerName;
	private String teamName;
	private String role;
	private String battingStyle;
	private Integer jerseyNumber;
}

package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Entity
@Table(name="MTM_Astronaut")
public class Astronaut {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Astronut_Id",initialValue =1000001,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer astronautId;
	@NonNull
	@Column(length=30)
	private String astronautName;
	@NonNull
	@Column(length=30)
	private String specialization;
	@NonNull
	@Column(length=30)
	private String nationality;
	@NonNull
	private Integer totalFlights;
	
	
	@ManyToMany(targetEntity = SpaceMission.class,cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name = "astronaut_mission",
	joinColumns = @JoinColumn(name="astronaut_Id",referencedColumnName = "astronautId"),
	inverseJoinColumns = @JoinColumn(name="mission_Id" ,referencedColumnName = "missionId"))
	List<SpaceMission> spaceMissions ;


	@Override
	public String toString() {
		return "Astronaut [astronautId=" + astronautId + ", astronautName=" + astronautName + ", specialization="
				+ specialization + ", nationality=" + nationality + ", totalFlights=" + totalFlights + "]";
	}

	
}

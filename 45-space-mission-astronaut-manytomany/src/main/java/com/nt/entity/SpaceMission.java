package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="MTM_SpaceMission")
public class SpaceMission {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Mission_Id",initialValue =101,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer missionId;
	@NonNull
	@Column(length=30)
	private String missionName;
	@NonNull
	private Integer launchYear;
	@NonNull
	@Column(length=30)
	private String destination;
	@NonNull
	@Column(length=30)
	private String  missionDuration;
	@ManyToMany(mappedBy = "spaceMissions",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<Astronaut> astronauts;
	@Override
	public String toString() {
		return "SpaceMission [missionId=" + missionId + ", missionName=" + missionName + ", launchYear=" + launchYear
				+ ", destination=" + destination + ", missionDuration=" + missionDuration + "]";
	}
	
	
}

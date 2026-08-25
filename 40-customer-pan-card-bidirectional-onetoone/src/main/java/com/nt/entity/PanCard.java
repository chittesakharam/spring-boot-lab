package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="OTO_PanCard")
public class PanCard {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Pan_Id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long panId;
	@Column(length=30)
	@NonNull
	private String panNumber;
	@Column(length=30)
	@NonNull
	private String issuDate;
	
	@OneToOne(mappedBy = "panCard")
	private Customer customer;

	@Override
	public String toString() {
		return "PanCard Id=" + panId + "\npanNumber=" + panNumber + "\nissuDate=" + issuDate ;
	}

	
	
	
}

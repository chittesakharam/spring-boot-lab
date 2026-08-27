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
public class Festival {
	
	@Id
	@SequenceGenerator(name ="gen1" ,sequenceName = "Fest_Id",initialValue = 1001,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer festivalId;
	@NonNull
	@Column(length=30)
	private String festivalName;
	@NonNull
	@Column(length=30)
	private String city;
	@NonNull
	private String eventDate;
	@NonNull
	private Double ticketprice;

	@ManyToMany(mappedBy = "festivals",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	
	private List<Artist> artists;
	
	

	@Override
	public String toString() {
		return "Festival [festivalId=" + festivalId + ", festivalName=" + festivalName + ", city=" + city
				+ ", eventDate=" + eventDate + ", ticketprice=" + ticketprice + "]";
	}

}

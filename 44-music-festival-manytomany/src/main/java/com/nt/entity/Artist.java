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
public class Artist {
	
	@Id
	@SequenceGenerator(name ="gen1" ,sequenceName = "Artist_Id",initialValue = 20001,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer artistId;
	@NonNull
	@Column(length=30)
	private  String artistName;
	@NonNull
	@Column(length=30)
	private String genere;
	@NonNull
	@Column(length=30)
	private String country;
	@NonNull
	private Integer experienceYears;

	
	@ManyToMany(targetEntity = Festival.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="Artist_Festival",
	       joinColumns =  @JoinColumn(name="artist_Id",referencedColumnName = "artistId"),
	        inverseJoinColumns = @JoinColumn(name="festival_Id", referencedColumnName = "festivalId")
			)	        
	private List<Festival> festivals;


	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + ", genere=" + genere + ", country="
				+ country + ", experienceYears=" + experienceYears + "]";
	}
	
	
	
}

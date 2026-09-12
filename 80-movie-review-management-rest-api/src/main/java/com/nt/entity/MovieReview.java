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
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Data
public class MovieReview {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "review_Id",initialValue = 10000000,allocationSize = 1 )
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long reviewId;
	@NonNull
	@Column(length=30)
	private String movieName;
	@NonNull
	@Column(length=30)
	private String reviewerName;
	@NonNull
	private Double rating;
	@NonNull
	@Column(length=100)
	private String reviewCmment;
	

}

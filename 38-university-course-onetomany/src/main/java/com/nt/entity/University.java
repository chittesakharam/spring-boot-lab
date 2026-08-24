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
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="OTM_University")
public class University {
	@Id
	@SequenceGenerator(name="gen1" ,sequenceName = "UID_SEQ",initialValue = 101,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy =GenerationType.SEQUENCE)
	private Long universityId;
	@Column(length=50)
	@NonNull
	private String universityName;
	@Column(length=30)
	@NonNull
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "university_id")
    private List<Course> courses;

}

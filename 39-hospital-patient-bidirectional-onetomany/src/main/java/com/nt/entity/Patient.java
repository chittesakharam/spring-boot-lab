package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="OTM_Patient")
public class Patient {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Pid_seq",initialValue = 1001,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long patientId;
	@NonNull
	@Column(length=30)
	private String patientName;
	@NonNull
	@Column(length=30)
	private String disease;
	@NonNull
	private Integer age;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	
	private Doctor doctor;

	@Override
	public String toString() {
		return "Patient Details \n patientId : " + patientId + "\n patientName : " + patientName + "\ndisease=" + disease + "\n age="
				+ age ;
	}
	
	

}

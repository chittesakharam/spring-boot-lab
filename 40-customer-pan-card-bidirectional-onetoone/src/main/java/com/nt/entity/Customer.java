package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name="OTO_Customer")
public class Customer {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Cust_Id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long customerId;
	@Column(length=30)
	@NonNull
	private String customerName;
	@Column(length=30)
	@NonNull
	private String email;
	@Column(length=30)
	@NonNull
	private String city;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pan_id")
	private PanCard panCard;

	@Override
	public String toString() {
		return "Customer Id=" + customerId + "\ncustomerName=" + customerName + "\nemail=" + email + "\ncity="
				+ city ;
	}
	
	

}

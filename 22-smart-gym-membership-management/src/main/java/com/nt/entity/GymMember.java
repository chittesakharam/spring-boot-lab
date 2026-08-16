package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class GymMember {
 
	@Id
	private Long memberId;
	private String memberName;
	private String membershipType;
	private Integer membershipDuration;
	private Double fees;
	
	
	public GymMember() {
		super();
	}
	public GymMember(Long memberId, String memberName, String membershipType, Integer membershipDuration, Double fees) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipType = membershipType;
		this.membershipDuration = membershipDuration;
		this.fees = fees;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	public Integer getMembershipDuration() {
		return membershipDuration;
	}
	public void setMembershipDuration(Integer membershipDuration) {
		this.membershipDuration = membershipDuration;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	
	
}

package com.nt.services;

import java.util.List;

import com.nt.entity.GymMember;

public interface IGymMemberService {
	
	String addMember(GymMember member);
	String addAllMembers(List<GymMember> members);
	GymMember getMemberById(Long id);
	List<GymMember> getAllMembers();
	String updateMember(Long id,double fee);
	String removeMember(Long id);
	String removeAllMembers();
	long totalMembers();
    boolean memberExists(Long id);

}

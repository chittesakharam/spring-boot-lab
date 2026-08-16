package com.nt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.entity.GymMember;
import com.nt.repository.IGymMemberRepository;

@Service
public class GymMemberService implements IGymMemberService {

	private IGymMemberRepository repo;
	@Override
	public String addMember(GymMember member) {
		repo.save(member);
		return "Member Added";
	}

	@Override
	public String addAllMembers(List<GymMember> members) {
		 repo.saveAll(members);
		return members.size()+" Members Added";
	}

	@Override
	public GymMember getMemberById(Long id) {
		 GymMember gymMember = repo.findById(id).get();
		return gymMember;
	}

	@Override
	public List<GymMember> getAllMembers() {
		
		return repo.findAll();
	}

	@Override
	public String updateMember(Long id, double fee) {
		GymMember gymMember = repo.findById(id).get();
		gymMember.setFees(fee);
		repo.save(gymMember);
		return "Updated..";
	}

	@Override
	public String removeMember(Long id) {
		if(repo.existsById(id))
		{ 
        	repo.deleteById(id);
        	return "Remove Member";
        }
        else
		return "Member not Found ";
	}

	@Override
	public String removeAllMembers() {
		 repo.deleteAll();
		return "All Members Removed";
	}

	@Override
	public long totalMembers() {
		
		return repo.count();
	}

	@Override
	public boolean memberExists(Long id) {
		
		return repo.existsById(id);
	}

}

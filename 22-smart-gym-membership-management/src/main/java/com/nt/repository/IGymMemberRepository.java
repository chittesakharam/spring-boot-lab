package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.GymMember;

public interface IGymMemberRepository extends JpaRepository<GymMember, Long> {

}

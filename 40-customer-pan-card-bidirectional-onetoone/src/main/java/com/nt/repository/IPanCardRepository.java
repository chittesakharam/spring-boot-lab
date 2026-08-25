package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PanCard;

public interface IPanCardRepository extends JpaRepository<PanCard, Long> {

}

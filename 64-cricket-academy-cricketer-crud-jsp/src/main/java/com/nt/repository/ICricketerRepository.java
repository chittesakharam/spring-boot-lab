package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Cricketer;

public interface ICricketerRepository extends JpaRepository<Cricketer, Integer> {

}

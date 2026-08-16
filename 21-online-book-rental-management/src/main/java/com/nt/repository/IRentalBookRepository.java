package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.RentalBook;

public interface IRentalBookRepository extends JpaRepository<RentalBook, Long> {

}

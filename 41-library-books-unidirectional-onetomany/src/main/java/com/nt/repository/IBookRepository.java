package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entitiy.Book;

public interface IBookRepository extends JpaRepository<Book, Long> {

}

package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> , PagingAndSortingRepository<Book, Integer>{

}

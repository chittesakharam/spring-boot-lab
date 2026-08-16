package com.nt.service;

import java.util.List;

import com.nt.entity.RentalBook;

public interface IRentalBookService {

	String saveBook(RentalBook book);
	String saveAllBooks(List<RentalBook> books);
	RentalBook getBookById(Long id);
	List<RentalBook>getAllBooks();
    String updateBook(long id,double price);
    String deleteBookById(Long id);
    String deleteAllBooks();
    Long countBooks();
    Boolean existsBook(Long id);
}

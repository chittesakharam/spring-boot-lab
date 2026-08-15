package com.nt.service;

import com.nt.entity.Book;

public interface IBookService {
	
	String addNewBook(Book book);
	Iterable<Book> viewAllBook();
	Book findBookById(int id);
	String updateBookPrice(int id,double price);
	String deleteBookById(int id);
	boolean checkBookAvailability(int id);
	long countTotalBooks();

}

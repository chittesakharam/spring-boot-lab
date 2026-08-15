package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Book;
import com.nt.service.IBookService;
@Component
public class BookController {
	@Autowired
	private IBookService service;
	
	public void addNewBook(Book book)
	{
		String newBook = service.addNewBook(book);
		IO.println(newBook);
	}
	public void viewAllBook()
	{
		service.viewAllBook().forEach(IO::println);
	}
	
	public void findBookById(int id)
	{
		Book bookById = service.findBookById(id);
		IO.println(bookById);
	}
	public void updateBookPrice(int id,double price)
	{
		String updateBookPrice = service.updateBookPrice(id, price);
		IO.println(updateBookPrice);
	}
	public void deleteBookById(int id)
	{
		String deleteBookById = service.deleteBookById(id);
		IO.println(deleteBookById);
	}
	public void checkBookAvailability(int id)
	{
		boolean isAvailable = service.checkBookAvailability(id);
		IO.println(isAvailable ?"Book is Available": "Book is not Available");
		
	}
	public void countTotalBooks()
	{
		long total = service.countTotalBooks();
		IO.println("Total Books Available: "+total);
	}
	
	

}

package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Book;
import com.nt.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookRepository repo;

	@Override
	public String addNewBook(Book book) {
		if(book instanceof Book )
		{
			repo.save(book);
			return "Book Added Successfully ";
		}
		else
		return "Invalid Data";
	}

	@Override
	public Iterable<Book> viewAllBook() {
		   List<Book> all = repo.findAll();
		return all;
	}

	@Override
	public Book findBookById(int id) {
		  Book book = repo.findById(id).get();
		return book;
	}

	@Override
	public String updateBookPrice(int id, double price) {
		Book book = repo.findById(id).get();
		book.setPrice(price);
		  repo.save(book);
		return "price is updated...";
	}

	@Override
	public String deleteBookById(int id) {
		 boolean empty = repo.findById(id).isEmpty();
		if(!empty) {
		repo.deleteById(id);
		return "Book Deleted Successfully";
		}
		else
		return" Book not Found" ;
	}

	@Override
	public boolean checkBookAvailability(int id) {
		 boolean empty = repo.findById(id).isEmpty();
		return !empty;
	}

	@Override
	public long countTotalBooks() {
		long count = repo.count();
		return count;
	}

}

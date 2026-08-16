package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.RentalBook;
import com.nt.repository.IRentalBookRepository;
@Service
public class RentalBookService implements IRentalBookService {

	@Autowired
	private IRentalBookRepository repo;
	@Override
	public String saveBook(RentalBook book) {
		 repo.save(book);
		return "Book Saved Successfully..";
	}

	@Override
	public String saveAllBooks(List<RentalBook> books) {
		   repo.saveAll(books);
		return books.size()+" Book Seved Successfully..";
	}

	@Override
	public RentalBook getBookById(Long id) {
		  RentalBook rentalBook = repo.findById(id).get();
		return rentalBook;
	}

	@Override
	public List<RentalBook> getAllBooks() {
		  List<RentalBook> all = repo.findAll();
		return all;
	}

	@Override
	public String updateBook(long id,double price) {
		  RentalBook rentalBook = repo.findById(id).get();
		  rentalBook.setRentalPrice(price);
		   repo.save(rentalBook);
		return "Book Updated Successefully";
	}

	@Override
	public String deleteBookById(Long id) {
		   if(!repo.existsById(id))
		   {
			   repo.deleteById(id);
			  return "Book Deleted ";
		   }
		   else
		return "Book Not Found" ;
	}

	@Override
	public String deleteAllBooks() {
		  int size=repo.findAll().size();
		  repo.deleteAll();
		return size+" Books are Deleted ";
	}

	@Override
	public Long countBooks() {
		   long count = repo.count();
		return count;
	}

	@Override
	public Boolean existsBook(Long id) {
		
		return repo.existsById(id);
	}

}

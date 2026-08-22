package com.nt.service;

import java.util.List;

import com.nt.entity.LibraryBook;
import com.nt.repository.LibraryBookRepository;

public class LibraryService implements ILibraryService {

	private LibraryBookRepository repo;
	@Override
	public String addBookWithCoverImg(LibraryBook book) {
		Long id = repo.save(book).getBookId();
		return id+" id with book Saved";
	}

	@Override
	public LibraryBook showBookById(Long id) {
		
		return repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id "));
	}

	@Override
	public List<LibraryBook> showAllBooks() {
		
		return repo.findAll();
	}

	@Override
	public String deleteBookById(Long id) {
		 LibraryBook lr = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		 repo.delete(lr);
		 
		return id+" Book Deleted " ;
	}

}

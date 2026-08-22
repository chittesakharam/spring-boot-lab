package com.nt.service;

import java.util.List;

import com.nt.entity.LibraryBook;

public interface ILibraryService {
	
	String addBookWithCoverImg(LibraryBook book);
	LibraryBook showBookById(Long id);
	List<LibraryBook> showAllBooks();
	String deleteBookById(Long id);

}

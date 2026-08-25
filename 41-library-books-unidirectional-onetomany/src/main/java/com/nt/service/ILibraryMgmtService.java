package com.nt.service;

import java.util.List;

import com.nt.entitiy.Book;
import com.nt.entitiy.Library;

public interface ILibraryMgmtService {
	
	String addLibraryWithBooks(Library l);
	List<Library> showAllLibrariesWithBooks();
	
	List<Book> showBooksWithLibrary();
	
	String deleteLibraryWithBooks(Long libraryId);

}

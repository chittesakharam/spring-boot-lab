package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.entitiy.Book;
import com.nt.entitiy.Library;
import com.nt.repository.IBookRepository;
import com.nt.repository.ILibraryRepository;

@Service
public class LibraryMgmtService implements ILibraryMgmtService {

	private final ILibraryRepository lRepo;
	private final IBookRepository bRepo;

	LibraryMgmtService(ILibraryRepository lRepo, IBookRepository bRepo) {
		this.lRepo = lRepo;
		this.bRepo = bRepo;
	}
	@Override
	public String addLibraryWithBooks(Library l) {
		 
		Long id = lRepo.save(l).getLibraryId();
		return id+" With Library Added";
	}

	@Override
	public List<Library> showAllLibrariesWithBooks() {
		
		return lRepo.findAll();
	}

	@Override
	public List<Book> showBooksWithLibrary() {
		
		return bRepo.findAll();
	}

	@Override
	public String deleteLibraryWithBooks(Long libraryId) {
		Library library = lRepo.findById(libraryId).get();
		library.setBooks(null);
		 lRepo.save(library);
		 lRepo.delete(library);
		return libraryId+" Library Deleted";
	}

}

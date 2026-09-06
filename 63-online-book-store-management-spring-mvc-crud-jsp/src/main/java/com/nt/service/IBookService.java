package com.nt.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.vo.BookVO;

public interface IBookService {
	
	String addBook(BookVO book);
	
	BookVO viewBookById(Integer id);
	
	Page<BookVO> showBookPages(Pageable pageable);
	
	List<BookVO> viewAllBooks();
	
	String updateBook(BookVO book);
	
	String deleteBook(Integer id);

}

package com.nt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.entity.Book;
import com.nt.repository.IBookRepository;
import com.nt.vo.BookVO;

@Service
public class BookServiceImpl implements IBookService {

	private final IBookRepository repo;

	BookServiceImpl(IBookRepository repo) {
		this.repo = repo;
	}
	
      @Override
	public BookVO viewBookById(Integer id) {
		   Book book = repo.findById(id).get();
		   BookVO  vo = new BookVO();
		   BeanUtils.copyProperties(book, vo);
		return vo;
	}
	
	@Override
	public String addBook(BookVO book) {
		Book b1 = new Book();
		BeanUtils.copyProperties(book, b1);
		repo.save(b1);
		return "Book Saved With ID : "+b1.getId();
	}
	
	@Override
	public List<BookVO> viewAllBooks() {
		 
		
		 List<BookVO> list = repo.findAll().stream().map(b ->{ BookVO book = new BookVO(); BeanUtils.copyProperties(b,book);return book;}).toList();
		return list;
	}

	@Override
	public String updateBook(BookVO book) {
		Book bookentity = repo.findById(book.getId()).get();
		BeanUtils.copyProperties(book, bookentity);
		repo.save(bookentity);
		return bookentity.getId()+" Books Updated";
	}
	
	@Override
	public String deleteBook(Integer id) {
		  Optional<Book> byId = repo.findById(id);
		  if(byId.isPresent())
			  repo.deleteById(id);
		  else
			  return " Book Not Found";
		return id+" Book is Deleted";
	}
	
	@Override
	public Page<BookVO> showBookPages(Pageable pageable) {
	
		 Page<Book> all = repo.findAll(pageable);
		
		 Page<BookVO> map = all.map(book -> {
	        BookVO bookVO = new BookVO();
	        BeanUtils.copyProperties(book, bookVO);
	        return bookVO;
	    });
         return map;
	}

}

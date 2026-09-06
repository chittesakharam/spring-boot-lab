package com.nt.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.service.IBookService;
import com.nt.vo.BookVO;

@Controller()
public class BookStoreController {
	
	private final IBookService service;

	BookStoreController(IBookService service) {
		this.service = service;
	}
	
	
	@GetMapping("/")
	public String homePage()
	{
		System.out.println("BookStoreController.homePage()");
		
		
		return "welcome";
	}

	
	@GetMapping("/register")
	public String registerBook(@ModelAttribute("bookVO") BookVO book)
	{
		System.out.println("BookStoreController.registerBook()");
		return "book_form";
	}
	@PostMapping("/save")
	public String saveBook(RedirectAttributes attrs,@ModelAttribute("bookVO") BookVO book)
	{
		
		System.out.println("BookStoreController.saveBook()");
		String msg = service.addBook(book);
		attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String displayAllBooks(@PageableDefault(page = 0, size = 10,  sort = "title", direction = Direction.ASC)
	        Pageable pageable,
	        Map<String, Object> map) {
    System.out.println("BookStoreController.displayAllBooks()");
	    Page<BookVO> page = service.showBookPages(pageable);

	    map.put("bookData", page);

	    return "book_list";
	}
	
	
	
	@GetMapping("/edit")
	public String updateBook(@RequestParam("id") Integer id,@ModelAttribute("bookVO")BookVO bookVO)
	{
		System.out.println("BookStoreController.updateBook()");
	    BookVO vo = service.viewBookById(id);	
	    BeanUtils.copyProperties(vo, bookVO);
		return "update_book_form";
	}
	@PostMapping("/update")
	public String saveUpdatedBook(RedirectAttributes attrs ,@ModelAttribute("bookVO")BookVO bookVO)
	{
		System.out.println("BookStoreController.saveUpdatedBook()");
		String msg = service.updateBook(bookVO);
		  attrs.addFlashAttribute("updateMsg",msg);
		return "redirect:all";
	}
	
	@GetMapping("/delete")
	public String deleteBook(@RequestParam("id") Integer id,RedirectAttributes attrs)
	{
		String deleteMsg = service.deleteBook(id);
		
		attrs.addFlashAttribute("deleteMsg",deleteMsg);
		
		return "redirect:all";
	}
	
}

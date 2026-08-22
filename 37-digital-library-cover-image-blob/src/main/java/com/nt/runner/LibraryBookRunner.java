package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.LibraryBook;
import com.nt.service.ILibraryService;
@Component
public class LibraryBookRunner implements CommandLineRunner {

	@Autowired
	private ILibraryService service;
	@Override
	public void run(String... args) throws Exception {
		
		IO.println("1. Save Book Details with Cover Image\r\n2. Find Book By Id\r\n3. View All Books\r\n4. Delete Book\n5.Exit");
		
		int choice = Integer.parseInt(IO.readln("Enter Your choice"));
		
		switch(choice)
		{
		case 1->{
			Long id = Long.valueOf(IO.readln("Enter Book Id: "));
			String title= IO.readln("Enter Book Title: ");
			String author= IO.readln("Enter Author Name");
			String path = IO.readln("Enter Imp path ");
			
			 FileInputStream io = new FileInputStream(path);
			 byte [] image = new byte[io.available()];
			 image=io.readAllBytes();
			 
			 service.addBookWithCoverImg(new LibraryBook(id,title,author,image));
		
		}
		
		
		}

	}

}

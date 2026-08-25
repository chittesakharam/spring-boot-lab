package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entitiy.Book;
import com.nt.entitiy.Library;
import com.nt.service.ILibraryMgmtService;
@Component
public class LibraryMgmtRunner implements CommandLineRunner {

	private final ILibraryMgmtService service;

	LibraryMgmtRunner(ILibraryMgmtService service) {
		this.service = service;
	}
	@Override
	public void run(String... args) throws Exception {
		while(true) {
		IO.println("1.Save Library With Books \n2.Show All Library With Books \n3. show All Books with Librar \n 4. Delete Library with books by id \n5.Exit");
		
		int choice = Integer.parseInt(IO.readln("Enter Your choice"));
		
		switch(choice)
		{
		case 1->{
			    String lName= IO.readln("Enter Library Name:");
			    String location = IO.readln("Enter Location: ");
			    int n = Integer.parseInt(IO.readln("Enter no of Books : "));
			    List<Book> list = new ArrayList<>();
			    for(int i=0;i<n;i++) {
			    String title = IO.readln("Enter Book Title: ");
			    String author = IO.readln("Enter Author Name: ");
			    Double price = Double.parseDouble(IO.readln("Enter Book Price: "));
			    list.add(new Book(title,author,price));
			    }
			    Library l = new Library(lName,location);
			    l.setBooks(list);
			    String msg = service.addLibraryWithBooks(l);
			    IO.println(msg);
		}
		case 2-> service.showAllLibrariesWithBooks()
		.forEach(l->{
			IO.println(l);
			l.getBooks().forEach(IO::println);
		});
		
		case 3-> service.showBooksWithLibrary().forEach(b->{
			IO.println("Book Details "+b);
		
		});
		
		case 4-> {
			Long id = Long.parseLong(IO.readln("Enter LibraryId : "));
			String msg = service.deleteLibraryWithBooks(id);
			IO.println(msg);
		}
		case 5-> System.exit(0);
		}
		}

	}

}

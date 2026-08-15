package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.BookController;
import com.nt.entity.Book;

@Component
public class BookRunner implements CommandLineRunner {
    @Autowired
	private BookController b;
	@Override
	public void run(String... args) throws Exception {
		
		
		String menu="""
1. Add New Book
2. View All Books
3. Search Book By Id
4. Update Book Price
5. Delete Book
6. Check Book Availability
7. Count Total Books
			""";
		
		
		do {
			IO.println(menu);
			int choice=Integer.parseInt(IO.readln("Enter Your Choice: "));
		switch(choice)
		{
		case 1->{
			int id=Integer.parseInt(IO.readln("Enter Book id: "));
			String name=IO.readln("Enter Book Name:");
			String author=IO.readln("Enter author Name: ");
			Double price=Double.parseDouble(IO.readln("Enter Book Price: "));
			b.addNewBook(new Book(id,name,author,price) );
		}
		case 2->b.viewAllBook();
		case 3->{
			int id=Integer.parseInt(IO.readln("Enter Book id: "));
			b.findBookById(id);
		}
		case 4->{
			int id=Integer.parseInt(IO.readln("Enter Book id: "));
			Double price=Double.parseDouble(IO.readln("Enter Book Price: "));
			b.updateBookPrice(id, price);
		}
		case 5->
		{
			int id=Integer.parseInt(IO.readln("Enter Book id: "));
			b.deleteBookById(id);
		}
		case 6->
		{
			int id=Integer.parseInt(IO.readln("Enter Book id: "));
			b.checkBookAvailability(id);
		}
		case 7->b.countTotalBooks();
		case 8-> System.exit(0);
	    default->IO.println("Invalid Choice");
		
		}
		}while(true);

	}

}

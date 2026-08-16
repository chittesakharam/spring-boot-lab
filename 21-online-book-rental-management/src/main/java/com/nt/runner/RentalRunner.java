package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.RentalBook;
import com.nt.service.IRentalBookService;

@Component
public class RentalRunner implements CommandLineRunner {
	@Autowired
  private IRentalBookService service;

	@Override
	public void run(String... args) throws Exception {
		
		String menu = """
				========== Rental Book Management ==========
				1. Add New Book
				2. Add Multiple Books
				3. View All Books
				4. Search Book by ID
				5. Check Book Availability
				6. View Total Number of Books
				7. Update Book Rental Price
				8. Delete Book by ID
				9. Delete All Books
				0. Exit
				============================================
				""";
              do {
				IO.println(menu);
				int choice =Integer.parseInt(IO.readln("Enter Your Choice : "));
				switch(choice)
				{
				case 1->{
					 long id = Long.parseLong(IO.readln("Enter Book Id: "));
					 String name=IO.readln("Enter Book Title: ");
					 String author= IO.readln("Enter Author Name: ");
					 String category=IO.readln("Enter Category: ");
					 double price=Double.parseDouble(IO.readln("Enter Rental Price: "));
					 String saveBook = service.saveBook(new RentalBook(id,name,author,category,price));
					 IO.println(saveBook);
				}
				case 2->{
					    int n = Integer.parseInt(IO.readln("Enter no of Book : "));
					    List<RentalBook> list = new ArrayList<>();
					    for(int i=0;i<n;i++)
					    {
					    	long id = Long.parseLong(IO.readln("Enter Book Id: "));
							 String name=IO.readln("Enter Book Title: ");
							 String author= IO.readln("Enter Author Name: ");
							 String category=IO.readln("Enter Category: ");
							 double price=Double.parseDouble(IO.readln("Enter Rental Price: "));
							 list.add(new RentalBook(id,name,author,category,price));
					    	
					     }
					    String saveAllBooks = service.saveAllBooks(list);
					    IO.println(saveAllBooks);
					    
				}
				case 4->{
					long id = Long.parseLong(IO.readln("Enter Book Id: "));
					RentalBook book = service.getBookById(id);
					IO.println(book);
				}
				
				case 3->service.getAllBooks().forEach(IO::println);
				case 5-> {
					long id = Long.parseLong(IO.readln("Enter Book Id: "));
					Boolean existsBook = service.existsBook(id);
					IO.println(existsBook ? "Book Available" : "Book Not Available");
				}
				case 6->IO.println(service.countBooks()+" Total Books ");
				case 7->{
					long id = Long.parseLong(IO.readln("Enter Book Id: "));
					double price=Double.parseDouble(IO.readln("Enter Rental Price: "));
					String updateBook = service.updateBook(id, price);
					IO.println(updateBook);
				}
				case 8->{
					long id = Long.parseLong(IO.readln("Enter Book Id: "));
					String deleteBookById = service.deleteBookById(id);
					IO.println(deleteBookById);
				}
				case 9-> IO.println(service.deleteAllBooks());
				case 0->System.exit(0);
				}
				
              }while(true);
	}
}
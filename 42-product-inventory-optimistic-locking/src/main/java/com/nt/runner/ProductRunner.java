package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Product;
import com.nt.service.IProductMgmtService;

@Component
public class ProductRunner implements CommandLineRunner {

	private final  IProductMgmtService service;

	ProductRunner(IProductMgmtService service) {
		this.service = service;
	}
	@Override
	public void run(String... args) throws Exception {
		while(true) {
		IO.println("1.Save Multiple products \n2.view Product by Id \n3.Update product price and Quantity \n4.View All Products \n5.Exit");
		
		int choice = Integer.parseInt(IO.readln("Enter your choice: "));
		switch(choice)
		{
		case 1-> {
			int n = Integer.parseInt(IO.readln("Enter No of product save:  "));
			List<Product> products = new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				String pName = IO.readln("Product Name: ");
				Double price = Double.parseDouble(IO.readln("Price: "));
				Integer quantity = Integer.parseInt(IO.readln("Enter Quantity: "));
				products.add(new Product(pName,price,quantity));
			}
				String msg = service.addMultipleProducts(products);
				IO.println(msg);
			
		}
			case 2->{
				int id = Integer.parseInt(IO.readln("Enter product id:  "));
				Product product = service.findProductById(id);
				IO.println(product);
			}
			
			case 3->{
				int id = Integer.parseInt(IO.readln("Enter product id:  "));
				Double price = Double.parseDouble(IO.readln("Price: "));
				Integer quantity = Integer.parseInt(IO.readln("Enter Quantity: "));
				String updateProduct = service.updateProduct(id, quantity, price);
				IO.println(updateProduct);
			}
			case 4-> service.viewAllProducts().forEach(IO::println);
			case 5-> System.exit(0);
			
		}
		}
		
	}

}

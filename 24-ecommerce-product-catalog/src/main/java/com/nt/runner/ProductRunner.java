package com.nt.runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Product;
import com.nt.services.IProductService;

@Component
public class ProductRunner implements CommandLineRunner {

    @Autowired
    private IProductService service;

    @Override
    public void run(String... args) throws Exception {

        do {

            IO.println("\n===== E-Commerce Product Catalog System =====");
            IO.println("1. Add Product");
            IO.println("2. Display Products Page-wise");
            IO.println("3. Display Products Sorted By Price");
            IO.println("4. Search Product By ID");
            IO.println("5. Exit");

            int choice =
                    Integer.parseInt(IO.readln("Enter Choice : "));

            switch (choice) {

                case 1 -> {

                    int id = Integer.parseInt(IO.readln("Product ID : "));

                    String name = IO.readln("Product Name : ");

                    String category =IO.readln("Category : ");

                    String brand =IO.readln("Brand : ");

                    Double price = Double.parseDouble(IO.readln("Price : "));

                    Integer stock = Integer.parseInt( IO.readln("Stock Quantity : "));
                    Product prod = new Product(id,name,category,brand,price,stock);

                    service.addProduct(prod);

                    IO.println("Product Added Successfully");
                }

                case 2 -> {

                    int pageNo = Integer.parseInt(IO.readln("Enter Page Number : "));

                    Page<Product> page =service.getProductsByPage(pageNo - 1);

                    page.getContent().forEach(IO::println);
                }

                case 3 -> {

                    int pageNo = Integer.parseInt(
                            IO.readln("Enter Page Number : "));

                    String order =
                            IO.readln("Enter Sort Order (ASC/DESC) : ");

                    Page<Product> page =
                            service.getProductsSorted(
                                    pageNo - 1,
                                    order);

                    page.getContent()
                            .forEach(IO::println);
                }

                case 4 -> {

                    int id = Integer.parseInt(IO.readln("Enter Product ID : "));

                    Product product =service.getProduct(id);

                    if (product != null)
                        IO.println(product);
                    else
                        IO.println("Product Not Found");
                }

                case 5 -> {

                    IO.println("Thank You");
                    System.exit(0);
                }

                default -> IO.println("Invalid Choice");
            }

        } while (true);
    }
}
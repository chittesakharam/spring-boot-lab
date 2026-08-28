package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.entity.Orders;
import com.nt.service.ICustomerOrderMgmtService;

@Component
public class CustomerOrderRunner implements CommandLineRunner {

    @Autowired
    private ICustomerOrderMgmtService service;

    @Override
    public void run(String... args) throws Exception {

        while (true) {

            IO.println("""
                    ========= MENU =========
                    1. Save Customer with Orders
                    2. View Customers
                    3.view Orders
                    4. Exit
                    """);

            int choice = Integer.parseInt(IO.readln("Enter Choice : "));

            switch (choice) {

                case 1 -> {
                	String name = IO.readln("Enter customer Name: ");
                	String email = IO.readln("Enter Email:");
                	int n  = Integer.parseInt(IO.readln("Enter no of Orders"));
                	List<Orders> list = new ArrayList<>();
                	for(int i=0;i<n;i++)
                	{
                		String pname = IO.readln("Enter product Name: ");
                		double price = Double.parseDouble(IO.readln("Enter Price: "));
                		list.add(new Orders(pname,price));
                	}
                	Customer c = new Customer(name,email);
                	c.setOrders(list);
                service.registerCustomerWithOrders(c);
                }

                case 2 -> service.showCustomers();

                case 3-> service.showOrders();
                case 4 -> {
                    IO.println("Thank You...");
                    System.exit(0);
                }

                default -> IO.println("Invalid Choice");

            }

        }

    }

}
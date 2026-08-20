/**
 * 
 */
package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Order;
import com.nt.servie.IOrderService;

@Component
public class OrderRunner implements CommandLineRunner {

    @Autowired
    private IOrderService service;

    @Override
    public void run(String... args) throws Exception {

        while (true) {

            IO.println("1. Add Order");
            IO.println("2. View All Orders");
            IO.println("3. Display Orders By Category");
            IO.println("4. Display Orders By Payment Mode");
            IO.println("5. Find Orders Above Amount");
            IO.println("6. Delete Order");
            IO.println("7. Exit");

            IO.println("Enter Choice:");
            int choice = Integer.parseInt(IO.readln());

            switch (choice) {

            case 1->{

        
                String cname = IO.readln("Customer Name:");

              
                String pname = IO.readln("Product Name:");

                
                String category = IO.readln("Category:");

                IO.println("Total Amount:");
                Double amount = Double.parseDouble(IO.readln());

                IO.println("Payment Mode:");
                String payment = IO.readln();

                IO.println("Order Status:");
                String status = IO.readln();

                Order order = new Order(cname, pname, category,
                        amount, payment, status);

                service.addOrder(order);

                IO.println("Order Added Successfully...");
            }

            case 2->service.viewAllOrders().forEach(IO::println);

               

            case 3->{
                
                String cat = IO.readln("Enter Category:");

                service.getOrdersByCategory(cat).forEach(System.out::println);

            }

            case 4->{

               
                String payMode = IO.readln("Enter Payment Mode:");

                service.getOrdersByPaymentMode(payMode).forEach(System.out::println);

            }

            case 5->{

              
                Double amt = Double.parseDouble(IO.readln("Enter Amount:"));

                service.getOrdersAboveAmount(amt).forEach(System.out::println);

            }

            case 6->{

              
                Integer id = Integer.parseInt(IO.readln("Enter Order ID:"));

                service.deleteOrder(id);

                IO.println("Order Deleted Successfully...");
            }

            case 7->System.exit(0);

     
            }
        }
    }
}

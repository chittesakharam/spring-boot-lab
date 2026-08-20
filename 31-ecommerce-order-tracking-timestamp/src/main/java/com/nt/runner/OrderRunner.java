package com.nt.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Order;
import com.nt.service.IOrderService;

@Component
public class OrderRunner implements CommandLineRunner {

    @Autowired
    private IOrderService service;

    @Override
    public void run(String... args) throws Exception {

      String menu = """ 
 Add New Order
View All Orders
Update Order Status
Delete Order
Display Order with Created and Last Modified Timestamp

      		""";
      IO.println(menu);
        
        int choice = Integer.parseInt(IO.readln("Enter you choice "));
           switch(choice)
           {
        	   
           case 1-> 
           {
        	   Order o = new Order();
        	   o.setOrderId(Integer.parseInt(IO.readln("Enter Order id: ")));
        	   o.setCustomerName(IO.readln("Enter Customer Nmae: "));
        	   o.setProductName(IO.readln("Enter Product Name "));
        	   o.setQuantity(Integer.parseInt(IO.readln("Enter Quanity: ")));
        	   o.setTotalAmount(Double.parseDouble(IO.readln("Enter Amount")));
        	   o.setOrderStatus(IO.readln("Enter Status"));
        	  String order = service.addOrder(o);
        	  IO.println(order);
           }
           case 2->service.viewAllOrders().forEach(IO::println);
           
           case 3-> {
        	   String updateOrderStatus = service.updateOrderStatus(Integer.parseInt(IO.readln("Enter order id")), IO.readln("Enter new status"));
        	   IO.println(updateOrderStatus);
        	   
           }
           case 4->{
        	   String deleteOrder = service.deleteOrder(Integer.parseInt(IO.readln("Enter Id")));
        	   IO.println(deleteOrder);
           }
           case 5-> {
        	   Order orderById = service.getOrderById(Integer.parseInt(IO.readln("Enter id")));
        	   IO.println(orderById);
           }
           case 6-> System.exit(0);
           }
    }
}
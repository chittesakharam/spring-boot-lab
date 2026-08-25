package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.entity.PanCard;
import com.nt.service.ICustmoerPanMgmtService;

@Component
public class OneToOneRunner implements CommandLineRunner {

	@Autowired
	private ICustmoerPanMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		while(true) {
		IO.println("1.Save Customer With Pan Card \n2.view Customers With Pan Card all \n3.view PanCards with customer details \n4.delete customer with pan card by id\n5.Exit");
		
		int choice=Integer.parseInt(IO.readln("Enter your choice"));
		switch(choice)
		{
		case 1-> {
			  String cname = IO.readln("Enter Customer Name: ");
			  String email = IO.readln("Enter email : ");
			  String city = IO.readln("Enter City : ");
			  String pno = IO.readln("Enter Pan No : ");
			  String issuDate = IO.readln("Enter Issue Date  : ");
			  Customer c = new Customer(cname,email,city);
			  PanCard p = new PanCard(pno,issuDate);
			  c.setPanCard(p);
			  p.setCustomer(c);
			  String msg = service.storeCustomerWithPanCard(c);
			  IO.println(msg);
			  
		}
		case 2-> service.showAllCustomerWithPanCard().forEach(c->{
			IO.println(" Customer Details \n"+c);
			IO.println("Pan card Details \n"+c.getPanCard());
			IO.println("----------------------------------");
		});
		
		case 3-> service.showAllPanCardsWithCustomer().forEach(p->{
			IO.println(" Pan Card Details \n"+p);
			IO.println(" Customer Details \n"+p.getCustomer());
			IO.println("----------------------------------");
		});
		
		case 4->{
			 Long id = Long.parseLong(IO.readln("Enter Customer Id : "));
			 
			  String msg = service.deleteCustomerWithPanCard(id);
			  IO.println(msg);
		}
		case 5->System.exit(0);
		}
		}
	}

}

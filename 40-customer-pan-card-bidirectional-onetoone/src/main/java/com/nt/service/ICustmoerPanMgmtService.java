package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;
import com.nt.entity.PanCard;

public interface ICustmoerPanMgmtService {
	
	   String storeCustomerWithPanCard(Customer c);
	   
	   List<Customer> showAllCustomerWithPanCard();
	   
	   List<PanCard> showAllPanCardsWithCustomer();
	   
	   String deleteCustomerWithPanCard(Long id);

}

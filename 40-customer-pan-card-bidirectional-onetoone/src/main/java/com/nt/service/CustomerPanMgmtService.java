package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.entity.PanCard;
import com.nt.repository.ICustomerRepository;
import com.nt.repository.IPanCardRepository;

@Service
public class CustomerPanMgmtService implements ICustmoerPanMgmtService {

	@Autowired
	private ICustomerRepository cRepo;
	@Autowired
	private IPanCardRepository pRepo;
	@Override
	public String storeCustomerWithPanCard(Customer c) {
		 Long id = cRepo.save(c).getCustomerId();
		return id+" Customer Save ";
	}

	@Override
	public List<Customer> showAllCustomerWithPanCard() {
		
		return cRepo.findAll();
	}

	@Override
	public List<PanCard> showAllPanCardsWithCustomer() {
		
		return pRepo.findAll();
	}

	@Override
	public String deleteCustomerWithPanCard(Long id) {
		Customer cust = cRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id "));
		cust.getPanCard().setCustomer(null);	
		 cRepo.save(cust);
		cRepo.deleteById(id);
		return id+" Customer Deleted successfully";
	}

}

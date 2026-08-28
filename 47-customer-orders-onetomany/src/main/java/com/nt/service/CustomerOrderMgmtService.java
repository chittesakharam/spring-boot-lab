package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;
import com.nt.repository.IOrderRepository;

@Service
public class CustomerOrderMgmtService  implements ICustomerOrderMgmtService {

    @Autowired
    private ICustomerRepository customerRepo;
    @Autowired
    private IOrderRepository orderRepo;

    @Override
    public void registerCustomerWithOrders(Customer customer) {
         Integer id = customerRepo.save(customer).getId();
         IO.println(id+" Customer Saved");
        
    }

    
	@Override
	public void showOrders() {
		orderRepo.findAll().forEach(IO::println);
		
	}


	@Override
	public void showCustomers() {
		customerRepo.findAll().forEach(IO::println);
		
	}


}
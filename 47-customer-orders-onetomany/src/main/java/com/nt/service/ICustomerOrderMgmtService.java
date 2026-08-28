package com.nt.service;

import com.nt.entity.Customer;

public interface ICustomerOrderMgmtService {

    void registerCustomerWithOrders(Customer customer);

    void showCustomers();
    void showOrders();

}
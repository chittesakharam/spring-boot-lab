package com.nt.servie;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Order;
import com.nt.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private IOrderRepository repository;

    @Override
    public void addOrder(Order order) {
        repository.save(order);
    }

    @Override
    public List<Order> viewAllOrders() {
        return repository.findAll();
    }

    @Override
    public List<Order> getOrdersByCategory(String category) {
        return repository.findByCategory(category);
    }

    @Override
    public List<Order> getOrdersByPaymentMode(String paymentMode) {
        return repository.findByPaymentMode(paymentMode);
    }

    @Override
    public List<Order> getOrdersAboveAmount(Double amount) {
        return repository.findOrdersAboveAmount(amount);
    }

    @Override
    public void deleteOrder(Integer orderId) {
        repository.deleteById(orderId);
    }
}
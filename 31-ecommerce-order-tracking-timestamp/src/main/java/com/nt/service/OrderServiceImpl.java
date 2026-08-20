package com.nt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Order;
import com.nt.repository.IOrderRepository;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderRepository repo;

    @Override
    public String addOrder(Order order) {

        Order saved = repo.save(order);

        
            return "Order Added Successfully";
        
    }

    @Override
    public List<Order> viewAllOrders() {
        return repo.findAll();
    }

    @Override
    public String updateOrderStatus(Integer orderId, String status) {

        Optional<Order> opt = repo.findById(orderId);

        
            Order order = opt.get();
            order.setOrderStatus(status);
            repo.save(order);

            return "Order Status Updated Successfully";
       
    }

    @Override
    public String deleteOrder(Integer orderId) {

        if (repo.existsById(orderId)) {
            repo.deleteById(orderId);
            return "Order Deleted Successfully";
        }

        return "Order Not Found";
    }

    @Override
    public Order getOrderById(Integer orderId) {

        return repo.findById(orderId).orElse(null);
    }
}

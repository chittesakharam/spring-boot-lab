package com.nt.servie;


import java.util.List;

import com.nt.entity.Order;

public interface IOrderService {

    void addOrder(Order order);

    List<Order> viewAllOrders();

    List<Order> getOrdersByCategory(String category);

    List<Order> getOrdersByPaymentMode(String paymentMode);

    List<Order> getOrdersAboveAmount(Double amount);

    void deleteOrder(Integer orderId);
}
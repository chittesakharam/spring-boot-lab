package com.nt.service;


import java.util.List;

import com.nt.entity.Order;

public interface IOrderService {

    String addOrder(Order order);

    List<Order> viewAllOrders();

    String updateOrderStatus(Integer orderId, String status);

    String deleteOrder(Integer orderId);

    Order getOrderById(Integer orderId);
}
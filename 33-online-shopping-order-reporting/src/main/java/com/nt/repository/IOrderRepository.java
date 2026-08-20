package com.nt.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Order;

public interface IOrderRepository extends JpaRepository<Order, Integer> {

    @Query("from Order o where o.category=?1")
    List<Order> findByCategory(String category);

    @Query("from Order o where o.paymentMode=?1")
    List<Order> findByPaymentMode(String paymentMode);

    @Query("from Order o where o.totalAmount>?1")
    List<Order> findOrdersAboveAmount(Double amount);
}
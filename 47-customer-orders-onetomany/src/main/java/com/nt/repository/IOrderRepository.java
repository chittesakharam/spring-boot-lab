package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.entity.Orders;

public interface IOrderRepository extends JpaRepository<Orders, Integer> {

}
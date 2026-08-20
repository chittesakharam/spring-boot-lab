package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Order;

public interface IOrderRepository extends JpaRepository<Order, Integer> ,CrudRepository<Order, Integer> 
{

}

package com.eweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
package com.eweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}

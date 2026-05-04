package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.spring.entities.OrderItem;
import com.learning.spring.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> { 
	
	
}




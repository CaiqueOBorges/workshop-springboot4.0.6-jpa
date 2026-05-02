package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

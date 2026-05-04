package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learning.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

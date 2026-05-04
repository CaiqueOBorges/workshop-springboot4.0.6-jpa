package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learning.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

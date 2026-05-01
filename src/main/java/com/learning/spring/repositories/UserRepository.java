package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learning.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

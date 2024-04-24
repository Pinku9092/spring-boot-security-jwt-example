package com.pinku.spring.modules.api.repository;

import com.pinku.spring.modules.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);
}

package com.test.UserAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.UserAuth.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {
    
}


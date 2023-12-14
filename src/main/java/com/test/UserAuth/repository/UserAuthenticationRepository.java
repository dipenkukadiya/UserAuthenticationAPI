package com.test.UserAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.UserAuth.entity.UserAuthentication;

public interface UserAuthenticationRepository extends JpaRepository<UserAuthentication , Long> {
    
}


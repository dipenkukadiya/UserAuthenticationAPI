package com.test.UserAuth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.UserAuth.entity.User;
import com.test.UserAuth.repository.UserRepository;
import com.test.UserAuth.service.UserAuthenticationService;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
    @Autowired
    UserRepository userAuthenticationRepository;

    @Override
    public String addUserAuthentication(User userAuthentication) {
        userAuthenticationRepository.save(userAuthentication);
        return "successfully add";
    }

    @Override
    public User getUserAthentication(Long userId) {
       
        return userAuthenticationRepository.findById(userId).get();
    }

}

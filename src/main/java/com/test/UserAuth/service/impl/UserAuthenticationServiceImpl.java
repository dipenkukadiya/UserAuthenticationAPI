package com.test.UserAuth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.UserAuth.entity.UserAuthentication;
import com.test.UserAuth.repository.UserAuthenticationRepository;
import com.test.UserAuth.service.UserAuthenticationService;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
    @Autowired
    UserAuthenticationRepository userAuthenticationRepository;

    @Override
    public String addUserAuthentication(UserAuthentication userAuthentication) {
        userAuthenticationRepository.save(userAuthentication);
        return "successfully add";
    }

}

package com.test.UserAuth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.UserAuth.entity.UserAuthentication;
import com.test.UserAuth.service.UserAuthenticationService;

@RestController
@RequestMapping("/users/")
public class UserAuthenticationController {
    @Autowired
    UserAuthenticationService userAuthenticationService;

    @PostMapping
    public void addUserAuthentication(@RequestBody UserAuthentication userAuthentication) {
        userAuthenticationService.addUserAuthentication(userAuthentication);
         
    }

}

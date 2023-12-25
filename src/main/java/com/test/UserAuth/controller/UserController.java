package com.test.UserAuth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.UserAuth.entity.User;
import com.test.UserAuth.service.UserAuthenticationService;

@RestController
@RequestMapping("/users/")
public class UserController {
    @Autowired
    UserAuthenticationService userAuthenticationService;

    @GetMapping("{userId}")
    public User getUserAuthentication(@PathVariable Long userId) {
        return userAuthenticationService.getUserAthentication(userId);
    }

    @PostMapping
    public void addUserAuthentication(@RequestBody User userAuthentication) {
        userAuthenticationService.addUserAuthentication(userAuthentication);

    }

}

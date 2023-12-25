package com.test.UserAuth.service;


import com.test.UserAuth.entity.User;

public interface UserAuthenticationService {

 String addUserAuthentication(User userAuthentication);
 User getUserAthentication(Long userId);
 }

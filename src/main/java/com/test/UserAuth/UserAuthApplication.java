package com.test.UserAuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.test.UserAuth.entity.UserAuthentication;
import com.test.UserAuth.repository.UserAuthenticationRepository;

@SpringBootApplication
public class UserAuthApplication implements CommandLineRunner{
	@Autowired
	UserAuthenticationRepository userAuthenticationRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserAuthApplication.class, args); 
	}

	@Override
	public void run(String... args) throws Exception {
		UserAuthentication userAuthentication = new UserAuthentication();
		userAuthenticationRepository.save(userAuthentication);
	}

}

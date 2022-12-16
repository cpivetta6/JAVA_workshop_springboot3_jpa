package com.eweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eweb.course.entities.User;
import com.eweb.course.repositories.UserRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1  = new User(null, "Marilia", "marilia@gmail.com", "3123123123", "123456");
		User u2  = new User(null, "Rodox", "rodox@gmail.com", "3123123123", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}

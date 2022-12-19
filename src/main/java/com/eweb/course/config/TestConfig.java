package com.eweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eweb.course.entities.Order;
import com.eweb.course.entities.User;
import com.eweb.course.entities.enums.OrderStatus;
import com.eweb.course.repositories.OrderRepository;
import com.eweb.course.repositories.UserRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1  = new User(null, "Marilia", "marilia@gmail.com", "3123123123", "123456");
		User u2  = new User(null, "Rodox", "rodox@gmail.com", "3123123123", "123456");
		
		Order o1 = new Order(null, Instant.parse("2023-10-02T19:54:07Z"), OrderStatus.PAID,u1);
		Order o2 = new Order(null, Instant.parse("2021-10-05T19:54:07Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2024-12-02T19:54:07Z"),OrderStatus.DELIVERED,u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}

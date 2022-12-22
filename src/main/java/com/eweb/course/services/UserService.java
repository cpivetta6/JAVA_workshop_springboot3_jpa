package com.eweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eweb.course.entities.User;
import com.eweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long Id) {
		Optional<User> obj =  repository.findById(Id);
		return obj.get(); // retorna o objeto user 
		
	}

	
	public User insert(User obj) {
		repository.save(obj);
		return obj;
	}
	
	
}

package com.eweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}

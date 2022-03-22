package com.risbo_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.risbo_app.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	public User findByUsername(String username);

}

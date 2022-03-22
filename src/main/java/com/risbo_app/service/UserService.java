package com.risbo_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.risbo_app.entities.User;
import com.risbo_app.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User	getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}

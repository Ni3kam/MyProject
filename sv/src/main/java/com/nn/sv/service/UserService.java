package com.nn.sv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nn.sv.model.UserEntity;
import com.nn.sv.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserEntity findByUsername(String userName) {
		return userRepository.findByUserName(userName);
	}

}

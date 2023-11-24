package com.nn.sv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nn.sv.model.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	UserEntity findByUserName(String userName);

}

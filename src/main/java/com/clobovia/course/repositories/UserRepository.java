package com.clobovia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clobovia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}

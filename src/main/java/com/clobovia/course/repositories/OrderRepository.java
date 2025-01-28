package com.clobovia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clobovia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}

package com.clobovia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clobovia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}

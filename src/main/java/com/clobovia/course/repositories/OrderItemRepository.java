package com.clobovia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clobovia.course.entities.OrderItem;
import com.clobovia.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
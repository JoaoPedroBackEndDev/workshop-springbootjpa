package com.aprendendospring.javacurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.javacurso.entities.OrderItem;
import com.aprendendospring.javacurso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}

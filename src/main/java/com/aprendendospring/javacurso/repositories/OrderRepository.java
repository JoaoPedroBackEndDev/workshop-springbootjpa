package com.aprendendospring.javacurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.javacurso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}

package com.aprendendospring.javacurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.javacurso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}

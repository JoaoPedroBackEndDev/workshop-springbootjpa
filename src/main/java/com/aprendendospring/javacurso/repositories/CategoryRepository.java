package com.aprendendospring.javacurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.javacurso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}

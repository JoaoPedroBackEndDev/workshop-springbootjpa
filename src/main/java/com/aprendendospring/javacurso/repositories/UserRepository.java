package com.aprendendospring.javacurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.javacurso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}

package com.fabio_antonio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio_antonio.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

	
	
}

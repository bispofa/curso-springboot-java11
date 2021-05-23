package com.fabio_antonio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabio_antonio.curso.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	

	
	
}

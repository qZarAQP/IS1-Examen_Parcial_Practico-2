package com.example.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Administrador;
import com.example.domain.Cancion;

public interface CancionRepository extends CrudRepository<Cancion, Long>{

	@Query("SELECT a FROM Cancion a")
	Collection<Cancion> findAll();
	
}

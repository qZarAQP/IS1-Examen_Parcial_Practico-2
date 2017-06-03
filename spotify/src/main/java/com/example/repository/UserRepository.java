package com.example.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Usuario;


public interface UserRepository extends CrudRepository<Usuario, Long>{

	@Query("SELECT a FROM Usuario a WHERE a.numero = ?1")
	Usuario findByNumero(Long numero);
	// select a.* from account a
	 	@Query("SELECT a FROM Usuario a")
	 	Collection<Usuario> findAll();
	
}

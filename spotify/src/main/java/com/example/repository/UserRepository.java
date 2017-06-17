package com.example.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import java.net.UnknownServiceException;
import java.util.List;

import com.example.domain.Account;
import com.example.domain.Usuario;



@Component
public  interface UserRepository extends CrudRepository<Usuario, Long>  {

	@Query("SELECT a FROM Usuario a")
	Collection<Usuario> findAll();
	

	@Query(value="Select Persona.nombre FROM Persona INNER JOIN Administrador ON Persona.id=Administrador.id WHERE Persona.nombre = $1 AND Administrador.PASSWORD= $2", nativeQuery = true)
	String login_user(String usuario, String password);

	//Con esa consulta se mostrara el primer pantallazo para el Usuario
	@Query("SELECT a FROM Usuario a WHERE a.id = ?1")
	Usuario findByNumero(long id);

	
}

package com.example.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import java.net.UnknownServiceException;
import java.util.List;


import com.example.domain.Administrador;
import com.example.domain.Usuario;


public  interface AdminRepository extends CrudRepository<Administrador, Long>  {

	
	@Query("SELECT a FROM Administrador a")
	Collection<Administrador> findAll();
	
	//Con esa consulta se mostrara el primer pantallazo para el Usuario
	@Query("SELECT a FROM Administrador a WHERE a.id = ?1")
	Administrador findByNumero(long id);

	@Query("SELECT a FROM Administrador a WHERE a.nickname = ?1")
	Administrador findByNickname(String id);


	@Query("SELECT u FROM Administrador u WHERE u.password= ?2  and u.nickname= ?1 ")
	Administrador validarLogin(String usuario, String password);
	
}

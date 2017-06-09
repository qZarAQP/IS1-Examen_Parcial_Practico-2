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


public  interface AdminRepository extends CrudRepository<Administrador, Long>  {

	
	@Query("SELECT a FROM Administrador a")
	Collection<Administrador> findAll();
}

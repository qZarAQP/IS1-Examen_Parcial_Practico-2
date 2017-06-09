package com.example.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import java.net.UnknownServiceException;
import java.util.List;


import com.example.domain.Usuario;

<<<<<<< HEAD
=======

public interface UserRepository extends CrudRepository<Usuario, Long>{
>>>>>>> 69917d9f130177b16f08c510783f1c6de99bf0f3

@Component
public  interface UserRepository extends CrudRepository<Usuario, Long>  {

	
	@Query("SELECT a FROM Usuario a")
	Collection<Usuario> findAll();

}
<<<<<<< HEAD






=======
>>>>>>> 69917d9f130177b16f08c510783f1c6de99bf0f3

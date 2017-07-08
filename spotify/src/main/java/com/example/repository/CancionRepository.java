package com.example.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Administrador;
import com.example.domain.Cancion;
import com.example.domain.PlayList;

public interface CancionRepository extends CrudRepository<Cancion, Long>{

	@Query("SELECT a FROM Cancion a WHERE a.id_playlist = ?1")
	List<Cancion> findAllsongs( PlayList playlist );
	
}

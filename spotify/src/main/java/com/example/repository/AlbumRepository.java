package com.example.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Administrador;
import com.example.domain.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {
	
	@Query("SELECT a FROM Album a")
	Collection<Album> findAll();
}

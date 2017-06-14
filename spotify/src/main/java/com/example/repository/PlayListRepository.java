package com.example.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Album;
import com.example.domain.PlayList;

public interface PlayListRepository extends CrudRepository<PlayList, Long>{
	@Query("SELECT a FROM PlayList a")
	Collection<PlayList> findAll();
}

package com.example.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Album;
import com.example.domain.PlayList;
import com.example.domain.Usuario;

public interface PlayListRepository extends CrudRepository<PlayList, Long>{
	@Query("SELECT a FROM PlayList a WHERE a.usuario = ?1")
	List<PlayList> findAllsongs( Usuario usuario );
	
	
	/*@Query(" INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)"
			+ "	VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway')")
	Boolean crearPlayList();*/
	

}

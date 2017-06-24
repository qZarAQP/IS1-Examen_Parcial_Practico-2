package com.example.repository.service;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Administrador;
import com.example.domain.Cancion;
import com.example.domain.Persona;
import com.example.domain.PlayList;
import com.example.domain.Usuario;
import com.example.repository.CancionRepository;
import com.example.repository.PlayListRepository;
import com.example.repository.UserRepository;
@Component
public class CancionService {

	@Autowired
	CancionRepository cancionRepository;


	public Boolean crearCancion( Cancion cancion) throws Exception {
		System.out.println("cancion: " );
		
		cancionRepository.save(cancion);
		return true;
		
	}

	public Boolean deletedPlayList( Cancion cancion) throws Exception {
		System.out.println("playlist: " );
	
		//cancionRepository.delete(cancion.getId());
		return true;
		
	}
	public Collection<Cancion> listarCanciones()
	{
		return cancionRepository.findAll();
	}
	
	
	};
	

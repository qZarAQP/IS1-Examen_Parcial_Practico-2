package com.example.repository.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Administrador;
import com.example.domain.Artista;
import com.example.domain.Persona;

import com.example.domain.Usuario;
import com.example.repository.AdminRepository;
import com.example.repository.ArtistRepository;
import com.example.repository.UserRepository;

@Component
public class ArtistService {
  
    @Autowired
    ArtistRepository artistRepository;

	private Administrador user;
    

	public Boolean registraArtista( Artista artista) {
       
	        if (artista != null) {

	        	artistRepository.save(artista);
	            return true;

	        } 
	        	 return false;
	           
	        

	    }
	};
	
	
	

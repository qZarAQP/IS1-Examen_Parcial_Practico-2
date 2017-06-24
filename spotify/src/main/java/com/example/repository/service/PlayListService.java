package com.example.repository.service;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Administrador;
import com.example.domain.Persona;
import com.example.domain.PlayList;
import com.example.domain.Usuario;
import com.example.repository.PlayListRepository;
import com.example.repository.UserRepository;
@Component
public class PlayListService {

	@Autowired
	PlayListRepository playlistRepository;


	public Boolean crearPlayList( PlayList playlist) throws Exception {
		System.out.println("playlist: " );
		
		playlistRepository.save(playlist);
		return true;
		
	}

	public Boolean deletedPlayList( PlayList playlist) throws Exception {
		System.out.println("playlist: " );
	
		playlistRepository.delete(playlist.getId());
		return true;
		
	}
	public Collection<PlayList> listarPlayLists()
	{
		return playlistRepository.findAll();
	}
	
	
	};
	

package com.example.repository.service;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Administrador;
import com.example.domain.Cancion;
import com.example.domain.Persona;
import com.example.domain.PlayList;
import com.example.domain.Usuario;
import com.example.repository.CancionRepository;
import com.example.repository.PlayListRepository;
@Component
public class CancionService {

	private final Logger logger = LoggerFactory.getLogger(CancionService.class);
			
	@Autowired
	CancionRepository cancionRepository;
	
	@Autowired
	PlayListRepository playListRepository; 


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
	public List<Cancion> listarCancionesPorUsuario(long usuario)
	{
		Usuario user = new Usuario();
		user.setId(usuario);
		logger.info("Id de usuaio: " + usuario);
		List<Cancion> canciones = new LinkedList<>();
		//return cancionRepository.findAll();
		List<PlayList> playlists = playListRepository.findAllsongs(user);
	
		
		logger.debug("Cantidad de playlists del usuario: " + playlists.size());
		for(PlayList item : playlists) {
			logger.debug("Playlist " + item.getNombre());
			List<Cancion> cancionesPlaylist = cancionRepository.findAllsongs(item);
			for(Cancion c : cancionesPlaylist) {
				logger.debug("Cancion " + c.getNombre());
			}
			logger.debug("Cantidad de canciones de la playlist : " + item.getId() + ", = " + playlists.size());
			canciones.addAll(cancionesPlaylist);
		}
		return canciones;
		
	}
	
	
}
	

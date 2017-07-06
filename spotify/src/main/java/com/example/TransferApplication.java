package com.example;

import java.io.Console;
import java.sql.Date;
import java.time.Instant;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Account;
import com.example.domain.Administrador;
import com.example.domain.Album;
import com.example.domain.Artista;
import com.example.domain.Cancion;
import com.example.domain.Usuario;
import com.example.domain.Persona;
import com.example.domain.PlayList;

import com.example.repository.AdminRepository;
import com.example.repository.AlbumRepository;
import com.example.repository.ArtistRepository;
import com.example.repository.CancionRepository;
import com.example.repository.UserRepository;

import com.example.repository.PersonaRepository;
import com.example.repository.PlayListRepository;
import com.example.repository.UserRepository;
import com.example.repository.service.CancionService;
import com.example.repository.service.LoginService;
import com.example.repository.service.PlayListService;

@Controller
@SpringBootApplication
public class TransferApplication {

	

	@Autowired
	LoginService loginService;

	@Autowired
	PlayListService playlistService;
	
	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CancionService cancionService;
	
	@Autowired
	ArtistRepository artistRepository;
	
	@Autowired
	PlayListRepository playListRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	AdminRepository adminRepository;
	@PostConstruct
	void init() {
	//	Usuario a = new Usuario();
		
		
		Integer i=0; 
		
		for(i=0;i<10;i++)
		{
	//	Persona p1 =new Persona("persona"+Integer.toString(i), "persona"+Integer.toString(i)+"@ucsp",i*10000, Date.from(Instant.EPOCH));
		Usuario u1 =new Usuario("user"+Integer.toString(i),"user"+Integer.toString(i)+"@ucsp",i*10000,Date.from(Instant.EPOCH),"user"+Integer.toString(i),"user"+Integer.toString(i));
		Administrador a1 =new Administrador("admin"+Integer.toString(i),"admin"+Integer.toString(i)+"@ucsp",i*10000,Date.from(Instant.EPOCH),"admin"+Integer.toString(i),"admin"+Integer.toString(i));
//		Artista s1 =new Artista("artist"+Integer.toString(i),"artist"+Integer.toString(i)+"@ucsp",i*10000,Date.from(Instant.EPOCH),"artist"+Integer.toString(i),"artist"+Integer.toString(i));
	//	Cancion c=new Cancion("song"+Integer.toString(i),Integer.toUnsignedLong(i),Integer.toUnsignedLong(i),Date.from(Instant.EPOCH));
		

	//	personaRepository.save(p1);
		userRepository.save(u1);
		adminRepository.save(a1);
	//	artistRepository.save(s1);
	//	cancionRepository.save(c);
		
		}
		
		
		

		
	}

/*	@RequestMapping("/transferir")
	void transferir(@RequestParam String origen, @RequestParam String destino, 
			@RequestParam Double monto) throws Exception {
		transferService.transfer(origen, destino, monto);
	}
	*/
	

	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	 	@ResponseBody
	 	Boolean login(@RequestBody Usuario user) throws Exception {
		System.out.println("guardando: *******login***"+user.getNickname()+"**********" );

		
	 		//loginService.login(user.usuario, user.password);
 		loginService.login(user.getNickname(), user.getPassword());

	 		return Boolean.TRUE;
	  	}

	@RequestMapping(value = "/registro", method = RequestMethod.POST)
 	@ResponseBody
 	Boolean registro(@RequestBody Usuario user) throws Exception {
	System.out.println("guardando: *************************** registro******" );

	
 		loginService.registro(user);
 		return Boolean.TRUE;
  	}
	
	

	


	@RequestMapping("/usuario")
	@ResponseBody
	Usuario listaCuenta(@RequestParam Long numero) {
		return userRepository.findOne(numero);
	}

	
	///******Metodos de Usuario**********
	@RequestMapping("/usuarios")
  	@ResponseBody
  	Collection<Usuario> listarUsuario() {
  	return userRepository.findAll();
  	}
	/*
	//----crear nuevo play list solo que no se como XD
	@RequestMapping(value = "/crearPlayList", method = RequestMethod.POST)
 	@ResponseBody
 	Boolean crearPlayList(@RequestBody PlayList playlist) throws Exception {
		playlistService.crearPlayList(playlist);
 		return Boolean.TRUE;
  	}
	
	
	//----eliminar  play list solo que no se como XD x3!
	@RequestMapping(value = "/deletedPlayList", method = RequestMethod.POST)
 	@ResponseBody
 	Boolean deletedPlayList(@RequestBody PlayList playlist) throws Exception {
		playlistService.deletedPlayList(playlist);
 		return Boolean.TRUE;
  	}
	
	/*
	///******Metodos de Admin**********
	@RequestMapping("/admin")
  	@ResponseBody
  	Collection<Administrador> listarAdmin() {
  	return adminRepository.findAll();
  	}
	*/
	
	///******Metodos de Cancion**********
	@RequestMapping("/songs")
  	@ResponseBody
  	Collection<Cancion> listarCanciones() {
  	return cancionService.listarCanciones();
  	}
	
	
	///******Metodos de PlayList**********
	@RequestMapping("/playlists")
  	@ResponseBody
  	Collection<PlayList> listarPlayLists() {
  	return playlistService.listarPlayLists();
  	}
	/*
	
	///******Metodos de Album**********
	@RequestMapping("/albums")
  	@ResponseBody
  	Collection<Album> listarAlbums() {
  	return albumRepository.findAll();
  	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(TransferApplication.class, args);
	}
}


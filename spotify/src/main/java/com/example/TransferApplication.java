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
import com.example.repository.AccountRepository;
import com.example.repository.AdminRepository;
import com.example.repository.AlbumRepository;
import com.example.repository.ArtistRepository;
import com.example.repository.CancionRepository;
import com.example.repository.UserRepository;
import com.example.repository.IAccountRepository;
import com.example.repository.PersonaRepository;
import com.example.repository.PlayListRepository;
import com.example.repository.UserRepository;
import com.example.repository.service.LoginService;
import com.example.repository.service.TransferService;

@Controller
@SpringBootApplication
public class TransferApplication {

	@Autowired
	TransferService transferService;

	@Autowired
	LoginService loginService;

	@Autowired
	//IAccountRepository accountRepository;
	AccountRepository accountRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	CancionRepository cancionRepository;
	
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
		
		Account c1 = new Account();
		c1.setNumero("001");
		c1.setSaldo(1000d);
		Account c2 = new Account();
		c2.setNumero("002");
		c2.setSaldo(100d);
		accountRepository.save(c1);
		accountRepository.save(c2);
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
	
	@RequestMapping(value = "/transferir", method = RequestMethod.POST)
	 	@ResponseBody
	 	Boolean transferir(@RequestBody TransferBean transfer) throws Exception {
	 		transferService.transfer(transfer.origen, transfer.destino, transfer.monto);
	 		return Boolean.TRUE;
	  	}


	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	 	@ResponseBody
	 	Boolean login(@RequestBody User user) throws Exception {
		System.out.println("guardando: *********************************" );

		
	 		loginService.login(user.usuario, user.password);
	 		return registro(user);
	  	}

	@RequestMapping(value = "/registro", method = RequestMethod.POST)
 	@ResponseBody
 	Boolean registro(@RequestBody User user) throws Exception {
	System.out.println("guardando: *************************** registro******" );

	
 		loginService.login(user.usuario, user.password);
 		return Boolean.TRUE;
  	}
	
	
	
/*
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getSaved( users){
		Map<String,Object> map = new HashMap<String,Object>();
		
		if(userServices.saveOrUpdate(users)){
			map.put("status","200");
			map.put("message","Your record have been saved successfully");
		}
		
		return map;
	}
	
	
	
	*/
	
	/*
	@RequestMapping("/login")
  	@ResponseBody
  	Boolean login(@RequestParam String usuario, @RequestParam String password) throws Exception {
		loginService.login(usuario,password);
 		return Boolean.TRUE;}
*/
	@RequestMapping("/cuentas")
  	@ResponseBody
  	Collection<Account> listarCuentas() {
  	return accountRepository.findAll();
  	}
	
	
	/*
	
	///******Metodos de Usuario**********
	@RequestMapping("/usuarios")
  	@ResponseBody
  	Collection<Usuario> listarUsuario() {
  	return userRepository.findAll();
  	}
	//----crear nuevo play list solo que no se como XD
	@RequestMapping(value = "/crearPlayList", method = RequestMethod.POST)
 	@ResponseBody
 	Boolean crearPlayList(@RequestBody TransferBean transfer) throws Exception {
 		transferService.transfer(transfer.origen, transfer.destino, transfer.monto);
 		return Boolean.TRUE;
  	}
	
	//----eliminar  play list solo que no se como XD x3!
	@RequestMapping(value = "/deletedPlayList", method = RequestMethod.POST)
 	@ResponseBody
 	Boolean deletedPlayList(@RequestBody TransferBean transfer) throws Exception {
 		transferService.transfer(transfer.origen, transfer.destino, transfer.monto);
 		return Boolean.TRUE;
  	}
	
	
	///******Metodos de Admin**********
	@RequestMapping("/admin")
  	@ResponseBody
  	Collection<Administrador> listarAdmin() {
  	return adminRepository.findAll();
  	}
	
	
	///******Metodos de Cancion**********
	@RequestMapping("/songs")
  	@ResponseBody
  	Collection<Cancion> listarCanciones() {
  	return cancionRepository.findAll();
  	}
	
	
	///******Metodos de PlayList**********
	@RequestMapping("/playlists")
  	@ResponseBody
  	Collection<PlayList> listarPlayLists() {
  	return playListRepository.findAll();
  	}
	
	
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

class TransferBean {
	 	public String origen;
	 	public String destino;
	 	public Double monto;
}


class User {
	 	public String usuario;
	 	public String password;
	 
}

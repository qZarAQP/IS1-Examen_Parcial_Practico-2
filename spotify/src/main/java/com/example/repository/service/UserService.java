package com.example.repository.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Administrador;
import com.example.domain.Persona;

import com.example.domain.Usuario;

import com.example.repository.UserRepository;

@Component
public class UserService {
	@Autowired
	UserRepository userRepository;


	public Boolean configuracion(Usuario usuario) throws Exception {
		
		String nickname=usuario.getNickname();
		String password=usuario.getPassword();
		System.out.println("mbbbbbbbbbbbbbbbbbbbbb");
		String email=usuario.getemail();
		Long id=userRepository.findByNickname(nickname).getid();
		System.out.println(Long.toString(id));

		System.out.println(nickname);

		
			if(usuario!=null){
				System.out.println(nickname+"mnknn");

				UserRepository.configuracion(nickname,password ,email,id);
			return true;
				
		} else {
			throw new Exception("No esta registrado");}
	}
	
		

	
	public Boolean registro(Usuario usuario) throws Exception {
		
		if (usuario != null ){
			
			userRepository.save(usuario);
			return true;
			
		} else {
			throw new Exception("Error");
		}
		
	}
	
	};
	
	
	


/*
<<<<<<< HEAD
	@Autowired
	UserRepository userRepository;


	public Boolean login(String usuario, String password) throws Exception {
		System.out.println("guardando: " );
		
		
		if ((usuario != "" )&& (password !="") ){
			
			Usuario user= userRepository.validarLogin(usuario,password);
			if(user!=null){
			return true;
				}else { return false;}
			
		} else {
			throw new Exception("No esta registrado");
		}
	}
	
	public Boolean registro(Usuario usuario) throws Exception {
		
		if (usuario != null ){
			
			userRepository.save(usuario);
			return true;
			
		} else {
			throw new Exception("Error");
		}
		
	}
	
	};
	
	
	
=======
>>>>>>> ebcdafdc285a91ba6766435d0a1c241a9d06e35c

*/
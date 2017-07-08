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
public class LoginService {
    private final Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    UserRepository userRepository;

	private Usuario user;
    



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
	
	public Usuario session( String usuario) {
		System.out.println("guardando: nnnnnnnnnnnnnnn"+usuario );
		

		return userRepository.findByNickname(usuario);
	}
	
	
/*

    public Usuario login(String nickname, String password) throws Exception {
        logger.debug("Metodo login[usuario=" + nickname + "][password=" + password + "]");
        Usuario usuario = userRepository.validarLogin(nickname, password);

        return usuario;
    }*/

    public Boolean registro(Usuario usuario) throws Exception {

        if (usuario != null) {

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
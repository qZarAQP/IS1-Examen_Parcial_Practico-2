package com.example.repository.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Account;
import com.example.domain.Administrador;
import com.example.domain.Persona;
import com.example.domain.Transfer;
import com.example.domain.Usuario;

import com.example.repository.UserRepository;
@Component
public class LoginService {

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
	};
	

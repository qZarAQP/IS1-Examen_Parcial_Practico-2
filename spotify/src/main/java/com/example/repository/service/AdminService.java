package com.example.repository.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Administrador;
import com.example.domain.Persona;

import com.example.domain.Usuario;
import com.example.repository.AdminRepository;
import com.example.repository.UserRepository;

@Component
public class AdminService {
  
    @Autowired
    AdminRepository adminRepository;

	private Administrador user;
    

	public Boolean login_adm(String usuario, String password) throws Exception {
		
		if ((usuario != "" )&& (password !="") ){
			
			 user= adminRepository.validarLogin(usuario,password);
			System.out.println("guardando: ppppppppppp " +user.getNickname());
			
			
			if(user!=null){
			return true;
				}else { return false;}
			
		} else {
			throw new Exception("No esta registrado");
		}
	}
	
	public Administrador session_adm( String usuario) {
		System.out.println("guardando: nnnkkkkkk"+usuario );
		

		return adminRepository.findByNickname(usuario);
	}
	


	
	
	};
	
	
	

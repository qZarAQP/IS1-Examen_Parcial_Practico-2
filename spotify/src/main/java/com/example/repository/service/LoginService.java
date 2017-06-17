package com.example.repository.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Account;
import com.example.domain.Transfer;
import com.example.repository.IAccountRepository;
import com.example.repository.TransferRepository;
import com.example.repository.UserRepository;
import com.example.repository.AccountRepository;
@Component
public class LoginService {

	@Autowired
	//IAccountRepository repository;
	UserRepository userRepository;
	@Autowired
	TransferRepository transferRepository;

	public Boolean login(String usuario, String password) throws Exception {
		
	
		if ((usuario != "" )&& (password !="") ){
			
			String user= userRepository.login_user(usuario,password);
			if (user!="")return true;
			else return false;
		} else {
			throw new Exception("No esta registrado");
		}
	}
}

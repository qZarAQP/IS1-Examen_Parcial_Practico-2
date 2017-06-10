package com.example;

import java.sql.Date;
import java.util.Collection;

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
import com.example.domain.Usuario;
import com.example.domain.Persona;
import com.example.repository.AccountRepository;
import com.example.repository.AdminRepository;
import com.example.repository.UserRepository;
import com.example.repository.IAccountRepository;
import com.example.repository.UserRepository;
import com.example.repository.service.TransferService;

@Controller
@SpringBootApplication
public class TransferApplication {

	@Autowired
	TransferService transferService;

	@Autowired
	//IAccountRepository accountRepository;
	AccountRepository accountRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AdminRepository adminRepository;
	@PostConstruct
	void init() {
		Usuario a = new Usuario();
		
		Account c1 = new Account();
		c1.setNumero("001");
		c1.setSaldo(1000d);
		Account c2 = new Account();
		c2.setNumero("002");
		c2.setSaldo(100d);
		accountRepository.save(c1);
		accountRepository.save(c2);
		
		
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


	@RequestMapping("/cuentas")
  	@ResponseBody
  	Collection<Account> listarCuentas() {
  	return accountRepository.findAll();
  	}

	@RequestMapping("/usuarios")
  	@ResponseBody
  	Collection<Usuario> listarUsuario() {
  	return userRepository.findAll();
  	}
	
	@RequestMapping("/admin")
  	@ResponseBody
  	Collection<Administrador> listarAdmin() {
  	return adminRepository.findAll();
  	}

	public static void main(String[] args) {
		SpringApplication.run(TransferApplication.class, args);
	}
}

class TransferBean {
	 	public String origen;
	 	public String destino;
	 	public Double monto;
}

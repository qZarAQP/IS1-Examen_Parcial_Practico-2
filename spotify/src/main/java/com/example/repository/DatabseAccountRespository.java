package com.example.repository;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.example.domain.Account;

@Component
public class DatabseAccountRespository implements IAccountRepository {

	// abrir connection a BD

	@Override
	public void save(Account account) {
		// INSERT o UPDATE
	}

	@Override
	public Account get(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String numero) {
		// TODO Auto-generated method stub
		
	}

}

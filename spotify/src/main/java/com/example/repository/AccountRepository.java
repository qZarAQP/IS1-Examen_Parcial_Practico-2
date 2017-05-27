package com.example.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.domain.Account;

//@Component
public class AccountRepository implements IAccountRepository {
	Map<String, Account> accounts = new HashMap<>();

	@Override
	public void save(Account account) {
		accounts.put(account.getNumero(), account);
	}
	@Override
	public Account get(String numero) {
		return accounts.get(numero);
	}

	@Override
	public Collection<Account> getAll() {
		return accounts.values();
	}
	@Override
	public void remove(String numero) {
		accounts.remove(numero);
	}
}

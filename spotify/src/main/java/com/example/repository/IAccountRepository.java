package com.example.repository;

import java.util.Collection;

import com.example.domain.Account;

public interface IAccountRepository {

	void save(Account account);

	Account get(String numero);

	Collection<Account> getAll();

	void remove(String numero);

}
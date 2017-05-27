package com.example.repository.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Account;
import com.example.domain.Transfer;
import com.example.repository.IAccountRepository;
import com.example.repository.TransferRepository;

@Component
public class TransferService {

	@Autowired
	IAccountRepository repository;

	@Autowired
	TransferRepository transferRepository;

	public void transfer(String cuentaOrigen, String cuentaDestino, double monto) throws Exception {
		Account source = repository.get(cuentaOrigen);
		Account target = repository.get(cuentaDestino);
		double saldo = source.getSaldo();
		if (saldo >= monto) {
			source.setSaldo(source.getSaldo() - monto);
			target.setSaldo(target.getSaldo() + monto);
			Transfer transfer = new Transfer();
			transfer.setOrigen(source);
			transfer.setDestino(target);
			transfer.setMonto(monto);
			transfer.setFecha(new Date());
			repository.save(source);
			repository.save(target);
			transferRepository.save(transfer);
		} else {
			throw new Exception("Saldo insuficiente");
		}
	}
}

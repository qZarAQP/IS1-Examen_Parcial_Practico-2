package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_account")
public class Account {

	@Id
	private String numero;

	private Double saldo;

	@ManyToMany
	@JoinTable(name = "account_person", 
		inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "dni"),
		joinColumns = @JoinColumn(name = "account_id", referencedColumnName = "numero"))
	private List<Person> owners;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<Person> getOwners() {
		return owners;
	}

	public void setOwners(List<Person> owners) {
		this.owners = owners;
	}
}

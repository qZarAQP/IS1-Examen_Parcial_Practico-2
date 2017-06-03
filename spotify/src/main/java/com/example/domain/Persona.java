package com.example.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Persona {
	
	@Id
	private Long id_persona;

	@Column(length = 64)
	private String nombre;
	
	@Column(length = 20)
	private String email;
	
	@Column(length = 20)
	private Integer telefono;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setemail(String email) {
		this.email = email;
	}

	public void settelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getemail() {
		return email;
	}
	
	public Integer gettelefono() {
		return telefono;
	}
	
}

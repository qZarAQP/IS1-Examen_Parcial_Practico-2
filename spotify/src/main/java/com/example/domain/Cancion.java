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
public class Cancion {
	
	
	@Id
	private Long Id_cancion;

	
	@Column(length = 64)
	private String nombre;
	
	@Column(length = 20)
	private String email;
	
	@Column(length = 20)
	private Integer telefono;


	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
	
	
}

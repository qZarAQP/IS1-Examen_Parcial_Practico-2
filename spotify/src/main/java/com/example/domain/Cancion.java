package com.example.domain;

import java.util.List;
import java.util.Date;

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
	private long Id_cancion;

	
	@Column
	private String nombre;
	
	@Column
	private boolean estado;
	
	@Column
	private Date fecha_registro;
	
	@Column
	private int valoracion;


	public String getnombre(long id_cancion) {
		return nombre;
	}
	
	public boolean getestado(long id_cancion) {
		return estado;
	}
	
	public int getvaloracion(long id_cancion) {
		return valoracion;
	}
	
	public Date getfec_registro(long id_cancion) {
		return fecha_registro;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public void setestado(boolean estado) {
		this.estado = estado;
	}


	public void setfecha_registro() {
		
	}

	public void reproducir() {
		
	}
	
	public void getinformacion() {
		
	}
	
	
	
	
}

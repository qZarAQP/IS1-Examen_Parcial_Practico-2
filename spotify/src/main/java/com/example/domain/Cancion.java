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


	

	
	//dggfgdfgdf
	
	
	
	
}

package com.example.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Album {
	
	
	@Id
	private Long Id_album;
	

	@Column(length = 64)
	private String nombre;

	
	@Column(length = 64)
	private Long Id_artista;
	
	@Column
	private Boolean estado;
	
	@Column
	private Date fecha;


	

	public Boolean getestado() {
		return estado;
	}

	public void setestado(Boolean estado) {
		this.estado = estado;
	}



	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	public void mostrar_canciones()
	{
		
	}
	
	

	
}

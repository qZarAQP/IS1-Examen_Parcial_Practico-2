package com.example.domain;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class PlayList {
	
	@Id
	private Long Id_playlist;
	

	@Column(length = 64)
	private String nombre;

	
	@Column(length = 64)
	private Long Id_usuario;
	
	@Column
	private Boolean estado;
	
	@Column
	private Date fecha;
	
	@Column(length = 64)
	private String[] Id_cancion;
	/*
	
	public List<Cancion> canciones;
	 @OneToMany(mappedBy = "playlist_cancion", cascade = CascadeType.ALL)
	    public List<Cancion> getcanciones() {
	        return canciones;
	    }*/


	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	
	public String[] getMostrar_canciones() {
		return Id_cancion;
	}

	public Boolean reproducir() {
		return true;
	}
	
	public Boolean agregar_cancion() {
		return true;
	}
	
	public Boolean eliminar_cancion() {
		return true;
	}	
//verificando conflictosss
}
	
	




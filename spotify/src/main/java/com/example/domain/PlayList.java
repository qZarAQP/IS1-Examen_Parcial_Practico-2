package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

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
	private String[] Id_cansion;

	
	public String[] getMostrar_canciones() {
		return Id_cansion;
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
	
	




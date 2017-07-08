package com.example.domain;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class PlayList {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	

	@Column(length = 64)
	private String nombre;

	
	@Column(length = 64)
	private Long id_usuario;
	
	@Column
	private Boolean estado;
	
	@Column
	private Date fecha;
	
	@Column(length = 64)
	private Long id_cancion;
	

	/*
	
	public List<Cancion> canciones;
	 @OneToMany(mappedBy = "playlist_cancion", cascade = CascadeType.ALL)
	    public List<Cancion> getcanciones() {
	        return canciones;
	    }*/
	

    @OneToMany(mappedBy = "id_playlist")
    private List<Cancion> canciones;

	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	
	public PlayList(){
	}

	
	public PlayList(String nombre, Long id_usuario,
			   Date fecha,Long id_cancion) {
	this.nombre = nombre;
	this.id_usuario = id_usuario;
	this.fecha = fecha;
	this.estado = true;
	this.id_cancion=id_cancion;
}

	public Long getId(){
		return id;
	}
	
	public Long getMostrar_canciones() {
		return id_cancion;
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
	
	




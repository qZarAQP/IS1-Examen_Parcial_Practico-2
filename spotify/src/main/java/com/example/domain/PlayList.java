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

	
	//@Column(length = 64)
	//private Long id_usuario;
	
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getId_cancion() {
		return id_cancion;
	}

	public void setId_cancion(Long id_cancion) {
		this.id_cancion = id_cancion;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PlayList(String nombre, Long usuario,
			   Date fecha,Long id_cancion) {
		this.nombre = nombre;
		//this.usuario = usuario;
		this.fecha = fecha;
		this.estado = true;
		this.id_cancion=id_cancion;
	}

	

		
//verificando conflictosss
}
	
	




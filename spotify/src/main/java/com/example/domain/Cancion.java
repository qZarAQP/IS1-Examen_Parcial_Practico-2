package com.example.domain;

import java.util.List;
import java.util.Date;

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
public class Cancion {
	
	@Id
	private long Id_cancion;

	
	@Column
	private String nombre;
	
	@Column
	private boolean estado;
	
	@Column
	private Date fecha;
	
	@Column
	private int valoracion;

	@ManyToOne
	@JoinColumn(name = "album")
	private Album album;
	
	
	
	@ManyToMany
	@JoinTable(name = "reproduccion", 
		inverseJoinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "Id_usuario"),
		joinColumns = @JoinColumn(name = "cancion_id", referencedColumnName = "Id_cancion"))
	private List<Usuario> reprod_user;
	

	@ManyToMany
	@JoinTable(name = "valoracion", 
		inverseJoinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "Id_usuario"),
		joinColumns = @JoinColumn(name = "cancion_id", referencedColumnName = "Id_cancion"))
	private List<Usuario> val_user;
	

	public String getnombre(long id_cancion) {
		return nombre;
	}
	
	public boolean getestado(long id_cancion) {
		return estado;
	}
	
	public int getvaloracion(long id_cancion) {
		return valoracion;
	}
	
	public Date getfecha(long id_cancion) {
		return fecha;
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
	/*
	public List<Usuario> getUsuario() {
		return reprod_user;
	}

	public void setOwners(List<Usuario> reprod_user) {
		this.reprod_user = reprod_user;
	}
	*/
	
	
	
}

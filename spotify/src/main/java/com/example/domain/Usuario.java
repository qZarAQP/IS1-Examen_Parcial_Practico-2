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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Usuario {
	@Id
	private Long Id_usuario;

	
	@Column(length = 64)
	private String contraseña;
	
	@Column
	private Boolean estado;
	
	@Column
	private Date fecha;


	
	
	@ManyToMany
	@JoinTable(name = "seguidores_user_to_user", 
		inverseJoinColumns = @JoinColumn(name = "usuario_seguidor_id", referencedColumnName = "Id_usuario"),
		joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "Id_usuario"))
	private List<Usuario> seguidores_usuario;
	
	@ManyToMany
	@JoinTable(name = "seguidos_user_to_user", 
		inverseJoinColumns = @JoinColumn(name = "usuario_seguido_id", referencedColumnName = "Id_usuario"),
		joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "Id_usuario"))
	private List<Usuario> seguidos_usuario;
	
	/*
	public List<PlayList> playlist;
	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "playlist_user")
	    public List<PlayList> getplaylist() {
	        return this.playlist;
	    }*/
	 
	

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
	
	

	public List<Usuario> getSeguidores() {
		return seguidores_usuario;
	}

	public void setSeguidores(List<Usuario> seguidores_usuario) {
		this.seguidores_usuario = seguidores_usuario;
	}


	
}

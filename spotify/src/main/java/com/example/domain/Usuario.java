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
		inverseJoinColumns = @JoinColumn(name = "usuario_seguido_id", referencedColumnName = "Id_usuario"),
		joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "Id_usuario"))
	private List<Usuario> seguidores_usuario;
	
	
	

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

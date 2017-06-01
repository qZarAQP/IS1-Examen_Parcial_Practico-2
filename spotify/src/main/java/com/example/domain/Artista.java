package com.example.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Artista {
	

	@Id
	private Long Id_artista;
	

	@Column(length = 64)
	private String nombre;

	
	@Column(length = 64)
	private String contraseña;
	
	@Column
	private Boolean estado;
	
	@Column
	private Date fecha;
	//List<Album> albumes;
/*
	 @OneToMany(mappedBy = "album_artista", cascade = CascadeType.ALL)
	    public List<Album> getalbumes() {
	        return albumes;
	    }
*/


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
	
	

	public void crear_album()
	{
		
	}
	
	public void cargar_canciones()
	{
		
	}




	
}

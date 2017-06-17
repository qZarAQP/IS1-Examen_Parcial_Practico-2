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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Album {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	

	@Column(length = 64)
	private String nombre;

	
	@Column(length = 64)
	private Long id_artista;
	
	@Column
	private Boolean estado;
	
	@Column
	private Date fecha;
	

	public Album(String nombre, 
				  Long id_artista, Date fecha) {
		this.nombre = nombre;
		this.id_artista = id_artista;
		this.fecha = fecha;
		this.estado = true;
	}
	
	
	//List<Cancion> canciones;
/*
	 @OneToMany(mappedBy = "album_cancion", cascade = CascadeType.ALL)
	    public List<Cancion> getcanciones() {
	        return canciones;
	    }
	
*/

	@ManyToOne
	@JoinColumn(name = "artista")
	private Artista artista;
	

	


    @OneToMany(mappedBy = "id_album")
    private List<Cancion> canciones;


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

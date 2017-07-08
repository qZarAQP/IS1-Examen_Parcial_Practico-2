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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column
	private String nombre;
	
	@Column
	private boolean estado;
	
	@Column
	private Date fecha;
	
	@Column
	private int valoracion;
	
	@Column
	private Long id_album;

	@ManyToOne
	@JoinColumn(name = "id_playlist")
	private PlayList id_playlist;
	//private Long id_playlist;
	
	public Cancion() {
		
	}

	public Cancion(String nombre, Long id_album,
				  Long id_artista, Date fecha) {
		this.nombre = nombre;
		this.id_album = id_album;
		this.fecha = fecha;
		this.estado = true;
		this.valoracion=0;
	}
	
	@ManyToOne
	@JoinColumn(name = "album")
	private Album album;
	

	@ManyToMany
	@JoinTable(name = "reproduccion", 
		inverseJoinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
		joinColumns = @JoinColumn(name = "cancion_id", referencedColumnName = "id"))
	private List<Usuario> reprod_user;
	

	@ManyToMany
	@JoinTable(name = "valoracion", 
		inverseJoinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
		joinColumns = @JoinColumn(name = "cancion_id", referencedColumnName = "id"))
	private List<Usuario> val_user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public Long getId_album() {
		return id_album;
	}

	public void setId_album(Long id_album) {
		this.id_album = id_album;
	}

	public PlayList getId_playlist() {
		return id_playlist;
	}

	public void setId_playlist(PlayList id_playlist) {
		this.id_playlist = id_playlist;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public List<Usuario> getReprod_user() {
		return reprod_user;
	}

	public void setReprod_user(List<Usuario> reprod_user) {
		this.reprod_user = reprod_user;
	}

	public List<Usuario> getVal_user() {
		return val_user;
	}

	public void setVal_user(List<Usuario> val_user) {
		this.val_user = val_user;
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

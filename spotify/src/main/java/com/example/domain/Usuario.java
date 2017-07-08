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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;



@Entity
public class Usuario extends Persona {

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(length = 64)
	private String nickname;
	
	@Column(length = 64)
	private String password;
	

	@Column
	private Date fecha;
	
	public Usuario(){
		
	}


	public Usuario(String nombre, String email, Integer telefono, Date fecha,String nickname,String password) {
		super(nombre, email, telefono, fecha);
		// TODO Auto-generated constructor stub
		
		this.nickname=nickname;
		this.password=password;
	}
	
	


	
	
	@ManyToMany
	@JoinTable(name = "seguidores_user_to_user", 
		inverseJoinColumns = @JoinColumn(name = "usuario_seguidor_id", referencedColumnName = "id"),
		joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"))
	private List<Usuario> seguidores_usuario;
	
	@ManyToMany
	@JoinTable(name = "seguidos_user_to_user", 
		inverseJoinColumns = @JoinColumn(name = "usuario_seguido_id", referencedColumnName = "id"),
		joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"))
	private List<Usuario> seguidos_usuario;
	
	@ManyToMany
	@JoinTable(name = "seguidores_artist_to_user", 
		inverseJoinColumns = @JoinColumn(name = "usuario_seguidor_id", referencedColumnName = "id"),
		joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"))
	private List<Artista> seguidores_artist;
	
	@ManyToMany
	@JoinTable(name = "seguidos_artist_to_user", 
		inverseJoinColumns = @JoinColumn(name = "usuario_seguido_id", referencedColumnName = "id"),
		joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"))
	private List<Artista> seguidos_artist;
	
	/*
	public List<PlayList> playlist;
	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "playlist_user")
	    public List<PlayList> getplaylist() {
	        return this.playlist;
	    }*/
	
	

    
    @OneToMany(mappedBy = "usuario")
    private List<PlayList> playlists;

	
	/*Asignacion de valores*/
	 
	public void setcontrasena(String password) {
		this.password = password;
	}
	


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/*Retorno de valores*/
	

	public Date getFecha() {
		return fecha;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword()
	{
		return password;
	}
	public String getNickname()
	{
		return nickname;
	}
	public List<Usuario> getSeguidores() {
		return seguidores_usuario;
	}

	public void setSeguidores(List<Usuario> seguidores_usuario) {
		this.seguidores_usuario = seguidores_usuario;
	}
}

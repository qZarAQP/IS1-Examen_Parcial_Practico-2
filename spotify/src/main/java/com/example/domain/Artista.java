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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;



@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Artista extends Persona{
	


	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	*/

	@Column(length = 64)
	private String nickname;

	
	@Column(length = 64)
	private String password;
	
	
	@Column
	private Date fecha;
	
public Artista(){
		
	}

	public Artista(String nombre, String email, Integer telefono, Date fecha,String nickname,String password) {
		super(nombre, email, telefono, fecha);
		// TODO Auto-generated constructor stub
		this.nickname=nickname;
		this.password=password;
	}

	//List<Album> albumes;
/*
	 @OneToMany(mappedBy = "album_artista", cascade = CascadeType.ALL)
	    public List<Album> getalbumes() {
	        return albumes;
	    }
*/


    @OneToMany(mappedBy = "artista")
    private List<Album> albumes;



 


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
	

	public String getNickname()
	{
		return nickname;
	}




	
}

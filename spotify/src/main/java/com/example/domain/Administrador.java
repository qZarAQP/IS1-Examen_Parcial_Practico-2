package com.example.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.Email;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Administrador extends Persona{
	
	@Column(length = 64)
	private String nickname;
	@Column(length = 64)
	private String password;
	
	
	
	@Column(nullable = false)
	private Date fecha = new Date();
	
	
	public Administrador(String nombre, String email, Integer telefono,Date fecha,String nickname,String password) {
		super(nombre, email, telefono, fecha);
		// TODO Auto-generated constructor stub
		
		this.nickname=nickname;
		this.password=password;
	}
	
	public String getpassword() {
		return password;
	}

	public void setemail(String password) {
		this.password = password;
	}

	

	
	public Date getfecha() {
		return fecha;
	}

	public void setfecha(Date created) {
		this.fecha = created;
	}
	
	
	public void login(){
		
	}
	
	public boolean habilitar_cancion()
	{
		return true;
		
	}
	
	public boolean habilitar_album()
	{
		return true;
		
	}
	
	public boolean habilitar_usuario()
	{
		return true;
		
	}
	
	public boolean desactivar_cancion()
	{
		return true;
		
	}
	public void desactivar_album()
	{
		
	}
	public void crear_ranking()
	{
		
	}
	public void desactivar_usuario()
	{
		
	}
	
	
	
	
}

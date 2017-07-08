package com.example.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;



@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Persona {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length = 64)
	private String nombre;
	@Column(length = 20)
	private String email;
	@Column(length = 20)
	private Integer telefono;
	@Column
	private Date fecha;
	@Column 
	private Boolean estado;

	
	public Persona(String nombre, String email,
				  Integer telefono, Date fecha) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.fecha = fecha;
		this.estado = true;
	}
	public Persona(){}
	

	public Long getid() {
		return id;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setemail(String email) {
		this.email = email;
	}

	public void settelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getemail() {
		return email;
	}
	
	public Integer gettelefono() {
		return telefono;
	}
	
}

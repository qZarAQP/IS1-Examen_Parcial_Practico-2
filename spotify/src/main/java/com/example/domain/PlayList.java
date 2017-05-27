package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class PlayList {
	
	@Id
	private Long Id_playlist;
	

	@Column(length = 64)
	private String nombre;

	
	@Column(length = 64)
	private Long Id_usuario;
	
	@Column
	private Boolean estado;
	
	@Column
	private Date fecha;
	
	@Column(length = 64)
	private Long Id_cansion;

}



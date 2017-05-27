package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transfer {
	@Id
	@Column(name = "id")
	private Long numeroOperacion;
	
	private Double monto;

	@ManyToOne
	@JoinColumn(name = "origen")
	private Account origen;
	
	@ManyToOne
	@JoinColumn(name = "destino")
	private Account destino;

	private Date fecha;

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Account getOrigen() {
		return origen;
	}

	public void setOrigen(Account origen) {
		this.origen = origen;
	}

	public Account getDestino() {
		return destino;
	}

	public void setDestino(Account destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getNumeroOperacion() {
		return numeroOperacion;
	}

	public void setNumeroOperacion(Long numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}

}

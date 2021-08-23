package com.springboot.app.sura.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ordenes")
public class Ordenes implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idorden;
	
	private Long idsol;
	private String estado;
	@Temporal(TemporalType.DATE)
	private Date fechaentrega;
	
	public Long getIdsol() {
		return idsol;
	}

	public void setIdsol(Long idsol) {
		this.idsol = idsol;
	}
	
	public Long getIdorden() {
		return idorden;
	}


	public void setIdorden(Long idorden) {
		this.idorden = idorden;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Date getFechaentrega() {
		return fechaentrega;
	}


	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}


	private static final long serialVersionUID = 1L;	

}

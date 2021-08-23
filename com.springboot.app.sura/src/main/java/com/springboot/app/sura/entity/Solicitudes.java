package com.springboot.app.sura.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solicitudes")
public class Solicitudes implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idsol;
	
	private Long idtipo;
	private Long idrol;
	private Long corx;
	private long cory;
	
	public Long getIdsol() {
		return idsol;
	}



	public void setIdsol(Long idsol) {
		this.idsol = idsol;
	}



	public Long getIdtipo() {
		return idtipo;
	}



	public void setIdtipo(Long idtipo) {
		this.idtipo = idtipo;
	}



	public Long getIdrol() {
		return idrol;
	}



	public void setIdrol(Long idrol) {
		this.idrol = idrol;
	}

	public Long getCorx() {
		return corx;
	}



	public void setCorx(Long corx) {
		this.corx = corx;
	}



	public long getCory() {
		return cory;
	}



	public void setCory(long cory) {
		this.cory = cory;
	}

	private static final long serialVersionUID = 1L;	
	
}

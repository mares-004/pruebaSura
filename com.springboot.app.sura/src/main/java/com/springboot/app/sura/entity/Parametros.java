package com.springboot.app.sura.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "parametros")
@IdClass(value = PK_Parametros.class)
public class Parametros implements Serializable {
	@Id
	private Long idparam; 
	@Id
	private Long idtipo;
	@Id
	private Long idmaterial;

	private Long icantidad;
	private Long idias;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(icantidad, idias, idmaterial, idparam, idtipo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parametros other = (Parametros) obj;
		return Objects.equals(icantidad, other.icantidad) && Objects.equals(idias, other.idias)
				&& Objects.equals(idmaterial, other.idmaterial) && Objects.equals(idparam, other.idparam)
				&& Objects.equals(idtipo, other.idtipo);
	}


	public Long getIdparam() {
		return idparam;
	}


	public void setIdparam(Long idparam) {
		this.idparam = idparam;
	}


	public Long getIdtipo() {
		return idtipo;
	}


	public void setIdtipo(Long idtipo) {
		this.idtipo = idtipo;
	}


	public Long getIdmaterial() {
		return idmaterial;
	}


	public void setIdmaterial(Long idmaterial) {
		this.idmaterial = idmaterial;
	}


	public Long getIcantidad() {
		return icantidad;
	}


	public void setIcantidad(Long icantidad) {
		this.icantidad = icantidad;
	}


	public Long getIdias() {
		return idias;
	}


	public void setIdias(Long idias) {
		this.idias = idias;
	}


	private static final long serialVersionUID = 1L;
}


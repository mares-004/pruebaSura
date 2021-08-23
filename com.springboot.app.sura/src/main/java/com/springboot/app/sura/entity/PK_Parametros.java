package com.springboot.app.sura.entity;

import java.io.Serializable;
import java.util.Objects;

public class PK_Parametros implements Serializable
{
	private Long idparam; 
	private Long idtipo;
	private Long idmaterial;
	@Override
	public int hashCode() {
		return Objects.hash(idmaterial, idparam, idtipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PK_Parametros other = (PK_Parametros) obj;
		return Objects.equals(idmaterial, other.idmaterial) && Objects.equals(idparam, other.idparam)
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

	private static final long serialVersionUID = 1L;
	
}

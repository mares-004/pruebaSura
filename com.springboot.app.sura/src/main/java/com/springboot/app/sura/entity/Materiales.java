package com.springboot.app.sura.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materiales")
public class Materiales implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idmaterial;
	private String material;

	public Long getIdmaterial() {
		return idmaterial;
	}

	public void setIdmaterial(Long idmaterial) {
		this.idmaterial = idmaterial;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	private static final long serialVersionUID = 1L;	
	

}

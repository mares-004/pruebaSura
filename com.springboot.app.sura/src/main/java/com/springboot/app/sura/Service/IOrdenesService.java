package com.springboot.app.sura.Service;

import java.util.List;

import com.springboot.app.sura.entity.Ordenes;

public interface IOrdenesService {
	
	public List<Ordenes> findAll();
	
	public Ordenes findById(Long id);
	
	public Ordenes saveOrden(Ordenes orden);
	
	public void deleteOrden(Long id);

}

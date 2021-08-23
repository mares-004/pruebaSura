package com.springboot.app.sura.Service;

import java.util.List;

import com.springboot.app.sura.entity.Construcciones;

public interface IConstruccionesService
{
	public List<Construcciones> findAll();
	
	public Construcciones saveConstruccion(Construcciones construcciones);
	
	public void deleteConstruccion(Long id);
	
	public Construcciones findById(Long id);

}
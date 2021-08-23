package com.springboot.app.sura.Service;

import java.util.List;

import com.springboot.app.sura.entity.Materiales;

public interface IMaterialesService {
	
	public List<Materiales> findAll();
	
	public Materiales findById(Long id);
	
	public Materiales saveMateriales(Materiales materiales);
	
	public void deleteMateriales(Long id);

}

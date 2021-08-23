package com.springboot.app.sura.Service;

import java.util.List;

import com.springboot.app.sura.entity.Parametros;

public interface IParametrosService {
	
	public List<Parametros> findAll();
	
	public Parametros findById(Long id);
	
	public Parametros saveParametros(Parametros parametros);
	
	public void deleteParametros(Long idparam, Long idtipo, Long idmaterial);

}

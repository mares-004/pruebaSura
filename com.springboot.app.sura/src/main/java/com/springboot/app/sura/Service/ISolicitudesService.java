package com.springboot.app.sura.Service;

import java.util.List;

import com.springboot.app.sura.entity.Solicitudes;

public interface ISolicitudesService {
	
	public List<Solicitudes> findAll();
	
	public Solicitudes findbyId(Long id);
	
	public Solicitudes saveSolicitud(Solicitudes solicitud);
	
	public void deleteSolicitud(Long id);

}

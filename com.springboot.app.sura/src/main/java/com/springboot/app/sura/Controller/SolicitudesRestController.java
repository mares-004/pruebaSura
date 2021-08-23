package com.springboot.app.sura.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.sura.Service.ISolicitudesService;
import com.springboot.app.sura.entity.Solicitudes;

@RestController
@RequestMapping("/api")
public class SolicitudesRestController {
	@Autowired
	ISolicitudesService solicitudesService;
	
	@GetMapping("/Solicitudes")
	public List<Solicitudes> findSolicitudes()
	{
		return solicitudesService.findAll();
	}
	
	@GetMapping("/Solicitudes/{id}")
	public Solicitudes findByIdSolicitud(@PathVariable Long id)
	{
		return solicitudesService.findbyId(id);
	}
	
	@PostMapping("/Solicitudes")
	@ResponseStatus(HttpStatus.CREATED)
	public Solicitudes saveSolicitud(@RequestBody Solicitudes solicitudes)
	{
		return solicitudesService.saveSolicitud(solicitudes);
	}
	
	@PutMapping("/Solicitudes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Solicitudes updateSolicitud(@RequestBody Solicitudes solicitudes, @PathVariable Long id)
	{
		Solicitudes actualSol = solicitudesService.findbyId(id);
		actualSol.setCorx(solicitudes.getCorx());
		actualSol.setCory(solicitudes.getCory());
		
		return solicitudesService.saveSolicitud(actualSol);
	}
	
	@DeleteMapping("/Solicitudes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void deleteSolicitud(@PathVariable Long id) {
		solicitudesService.deleteSolicitud(id);
	}

}

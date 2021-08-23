package com.springboot.app.sura.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.springboot.app.sura.entity.Construcciones;
import com.springboot.app.sura.Service.IConstruccionesService;

@RestController
@RequestMapping("/api")
public class ConstruccionesRestController
{
	@Autowired IConstruccionesService construccionesservice;
	
	@GetMapping("/Construcciones")
	public List<Construcciones> findConstrucciones()
	{
		return construccionesservice.findAll();
	}
	
	@GetMapping("/Construcciones/{id}")
	public Construcciones findConstruccionesById(@PathVariable Long id)
	{
		return construccionesservice.findById(id);
	}
	
	@PostMapping("/Construcciones")
	@ResponseStatus(HttpStatus.CREATED)
	public Construcciones saveConstrucciones(@RequestBody Construcciones construcciones)
	{
		return construccionesservice.saveConstruccion(construcciones);
	}
	
	@PutMapping("/Construcciones/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Construcciones updateConstrucciones(@RequestBody Construcciones construcciones, @PathVariable Long id)
	{
		Construcciones consactual = construccionesservice.findById(id);
		consactual.setTipo(construcciones.getTipo());
		return construccionesservice.saveConstruccion(consactual);
	}
	
	@DeleteMapping("/Construcciones/{id}")
	@ResponseStatus(HttpStatus.CREATED)	
	public void deleteConstrucciones(@PathVariable Long id)
	{
		construccionesservice.deleteConstruccion(id);
	}

}

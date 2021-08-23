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

import com.springboot.app.sura.Service.IOrdenesService;
import com.springboot.app.sura.entity.Ordenes;

@RestController
@RequestMapping("/api")
public class OrdenesRestController {
	
	@Autowired
	IOrdenesService ordenesService;
	
	@GetMapping("/Ordenes")
	public List<Ordenes> findAll(){
		return ordenesService.findAll();
	}
	
	@GetMapping("/Ordenes/{id}")
	public Ordenes findById(@PathVariable Long id) {
		return ordenesService.findById(id);
	}

	@PostMapping("/Ordenes")
	@ResponseStatus(HttpStatus.CREATED)
	public Ordenes saveOrden(@RequestBody Ordenes ordenes) {
		return ordenesService.saveOrden(ordenes);
	}
	
	@PutMapping("/Ordenes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Ordenes updateOrden(@RequestBody Ordenes ordenes, @PathVariable Long id) {
		Ordenes actualOrden = ordenesService.findById(id);
		actualOrden.setEstado(ordenes.getEstado());
		actualOrden.setFechaentrega(ordenes.getFechaentrega());
		return ordenesService.saveOrden(actualOrden);
	}
	
	@DeleteMapping("/Ordenes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void deleteOrden(@PathVariable Long id)
	{
		ordenesService.deleteOrden(id);
	}
	
	
}

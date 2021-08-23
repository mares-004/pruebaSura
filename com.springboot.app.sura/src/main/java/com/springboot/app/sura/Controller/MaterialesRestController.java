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

import com.springboot.app.sura.Service.IMaterialesService;
import com.springboot.app.sura.entity.Materiales;

@RestController
@RequestMapping("/api")
public class MaterialesRestController {

@Autowired
IMaterialesService materialesService;

@GetMapping("/Materiales")
public List<Materiales> findMateriales()
{
	return materialesService.findAll();
}

@GetMapping("/Materiales/{id}")
public Materiales findMaterialesById(@PathVariable Long id)
{
	return materialesService.findById(id);
}

@PostMapping("/Materiales")
@ResponseStatus(HttpStatus.CREATED)
public Materiales saveMaterial(@RequestBody Materiales materiales)
{
	return materialesService.saveMateriales(materiales);
}

@PutMapping("/Materiales/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Materiales updateMateriales(@RequestBody Materiales materiales, @PathVariable Long id)
{
	Materiales matactual = materialesService.findById(id);
	matactual.setMaterial(materiales.getMaterial());
	
	return materialesService.saveMateriales(matactual);

}

@DeleteMapping("/Materiales/{id}")
@ResponseStatus(HttpStatus.CREATED)
public void deleteMaterial(@PathVariable Long id)
{
	materialesService.deleteMateriales(id);
}

}

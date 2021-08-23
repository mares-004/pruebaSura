package com.springboot.app.sura.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.sura.Service.IParametrosService;
import com.springboot.app.sura.entity.Parametros;

@RestController
@RequestMapping("/api")
public class ParametrosRestController {
	
	@Autowired 
	IParametrosService parametrosService;
	
	@GetMapping("/Parametros")
	public List<Parametros> findAllParametros(){
		return parametrosService.findAll();
	}
	
	@GetMapping("/Parametros/{id}")
	public Parametros findParametrosById(@PathVariable Long id) {
		return parametrosService.findById(id);
	}
	
	@PostMapping("/Parametros")
	@ResponseStatus(HttpStatus.CREATED)
	public Parametros saveParametro(@RequestBody Parametros parametros) {
		return parametrosService.saveParametros(parametros);
	}
	
	@DeleteMapping(path="/Parametros/{idparam}/{idtipo}/{idmaterial}")
	@ResponseStatus(HttpStatus.CREATED)
	public void deleteParametro(@PathVariable Long idparam, @PathVariable Long idtipo, @PathVariable Long idmaterial)
	{
		parametrosService.deleteParametros(idparam, idtipo, idmaterial);
	}

}

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

import com.springboot.app.sura.Service.IRolesService;
import com.springboot.app.sura.entity.Roles;

@RestController
@RequestMapping("/api")
public class RolesRestController
{
	@Autowired
	IRolesService rolesService;

	@GetMapping("/Roles")
	public List<Roles> findRoles()
	{
		return rolesService.findAll();
	}
	
	@GetMapping("/Roles/{id}")
	public Roles findRolesById(@PathVariable Long id)
	{
		return rolesService.findById(id);
	}
	
	@PostMapping("/Roles")
	@ResponseStatus(HttpStatus.CREATED)
	public Roles saveRoles(@RequestBody Roles roles)
	{
		return rolesService.saveRoles(roles);
	}
	
	@PutMapping("/Roles/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Roles updateRoles(@RequestBody Roles roles, @PathVariable Long id)
	{
		Roles rolactual = rolesService.findById(id);
		rolactual.setRol(roles.getRol());
		return rolesService.saveRoles(rolactual);
	}
	
	@DeleteMapping("/Roles/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void deleteRoles(@PathVariable Long id)
	{
		rolesService.deleteRoles(id);
	}
}

package com.springboot.app.sura.Service;

import java.util.List;

import com.springboot.app.sura.entity.Roles;

public interface IRolesService
{
	public List<Roles> findAll();
	
	public Roles findById(Long id);
	
	public Roles saveRoles(Roles roles);
	
	public void deleteRoles(Long id);

}

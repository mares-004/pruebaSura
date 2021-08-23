package com.springboot.app.sura.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.sura.Dao.IRolesDao;
import com.springboot.app.sura.entity.Roles;

@Service
public class RolesServiceImpl implements IRolesService {
	
	@Autowired
	IRolesDao rolesDao;

	@Override
	@Transactional(readOnly = true)
	public List<Roles> findAll() {
		return (List<Roles>) rolesDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Roles findById(Long id) {
		return rolesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Roles saveRoles(Roles roles) {
		return rolesDao.save(roles);
	}

	@Override
	@Transactional
	public void deleteRoles(Long id) {
		rolesDao.deleteById(id);

	}

}

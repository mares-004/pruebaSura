package com.springboot.app.sura.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.sura.Dao.IConstruccionesDao;
import com.springboot.app.sura.entity.Construcciones;

@Service
public class ConstruccionesServiceImpl implements IConstruccionesService {
	
	@Autowired
	private IConstruccionesDao ConstruccionesDao; 

	@Override
	@Transactional(readOnly=true)
	public List<Construcciones> findAll() {
		return (List<Construcciones>)ConstruccionesDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Construcciones findById(Long id) {
		return ConstruccionesDao.findById(id).orElse(null);
	}	

	@Override
	@Transactional
	public Construcciones saveConstruccion(Construcciones construcciones) {
		return ConstruccionesDao.save(construcciones);
	}

	@Override
	@Transactional
	public void deleteConstruccion(Long id) {
		ConstruccionesDao.deleteById(id);
	}



}

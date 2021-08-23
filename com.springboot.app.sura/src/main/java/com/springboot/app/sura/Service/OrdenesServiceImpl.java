package com.springboot.app.sura.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.sura.Dao.IOrdenesDao;
import com.springboot.app.sura.entity.Ordenes;

@Service
public class OrdenesServiceImpl implements IOrdenesService {
	
	@Autowired
	IOrdenesDao ordenesDao;

	@Override
	@Transactional(readOnly = true)
	public List<Ordenes> findAll() {
		return (List<Ordenes>) ordenesDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Ordenes findById(Long id) {
		return ordenesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Ordenes saveOrden(Ordenes orden) {
		return ordenesDao.save(orden);
	}

	@Override
	@Transactional
	public void deleteOrden(Long id) {
		ordenesDao.deleteById(id);
	}

}

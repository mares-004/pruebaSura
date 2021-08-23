package com.springboot.app.sura.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.sura.Dao.IMaterialesDao;
import com.springboot.app.sura.entity.Materiales;

@Service
public class MaterialesServiceImpl implements IMaterialesService {
	@Autowired
	IMaterialesDao materialesDao;

	@Override
	@Transactional(readOnly = true)
	public List<Materiales> findAll() {
		return (List<Materiales>)materialesDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Materiales findById(Long id) {
		return materialesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Materiales saveMateriales(Materiales materiales) {
		return materialesDao.save(materiales);
	}

	@Override
	@Transactional
	public void deleteMateriales(Long id) {
		materialesDao.deleteById(id);

	}

}

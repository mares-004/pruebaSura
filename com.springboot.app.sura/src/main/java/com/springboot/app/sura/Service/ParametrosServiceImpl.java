package com.springboot.app.sura.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.sura.Dao.IParametrosDao;
import com.springboot.app.sura.Dao.RepositorioJDBC;
import com.springboot.app.sura.entity.Parametros;

@Service
public class ParametrosServiceImpl implements IParametrosService {
	
	@Autowired
	IParametrosDao parametrosDao;
	
	@Autowired
	private RepositorioJDBC repositoriojdc;

	@Override
	@Transactional(readOnly=true)
	public List<Parametros> findAll() {
		return (List<Parametros>) parametrosDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Parametros findById(Long id) {
		return parametrosDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Parametros saveParametros(Parametros parametros) {
		return parametrosDao.save(parametros);
	}

	@Override
	@Transactional
	public void deleteParametros(Long idparam, Long idtipo, Long idmaterial) {
		repositoriojdc.deleteParametros(idparam, idtipo, idmaterial);

	}

}

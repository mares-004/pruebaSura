package com.springboot.app.sura.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.sura.Dao.ISolicitudesDao;
import com.springboot.app.sura.Dao.RepositorioJDBC;
import com.springboot.app.sura.entity.Solicitudes;

@Service
public class SolicitudesServiceImpl implements ISolicitudesService {

	@Autowired
	ISolicitudesDao solicitudesDao;
	
	@Autowired
	private RepositorioJDBC repositoriojdc;
	
	@Override
	@Transactional(readOnly=true)
	public List<Solicitudes> findAll() {
		return (List<Solicitudes>) solicitudesDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Solicitudes findbyId(Long id) {
		return solicitudesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Solicitudes saveSolicitud(Solicitudes solicitud) {
		if(repositoriojdc.existeCoordenada(solicitud.getCorx(), solicitud.getCory()) == 0 && solicitud.getIdrol()==1)
			return solicitudesDao.save(solicitud);
		else
			return null;
	}

	@Override
	@Transactional
	public void deleteSolicitud(Long id) {
		solicitudesDao.deleteById(id);
	}

}

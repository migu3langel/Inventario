package com.inventarioActivos.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventarioActivos.model.entity.Activo;
import com.inventarioActivos.models.dao.IActivoDao;

@Service
public class ActivoServiceImpl implements IActivoService {

	@Autowired
	private IActivoDao activoDao;
	
	@Override
	public List<Activo> findAll() {

		return (List<Activo>) activoDao.findAll();
	}

	@Override
	public Activo findById(String id) {
		
		return activoDao.findById(id).orElse(null);
	}
	

	
	@Override
	@Transactional
	public Activo save(Activo activo) {
		
		return activoDao.save(activo);
	}
	


}

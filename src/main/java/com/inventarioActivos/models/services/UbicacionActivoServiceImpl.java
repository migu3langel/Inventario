package com.inventarioActivos.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventarioActivos.model.entity.UbicacionActivo;

import com.inventarioActivos.models.dao.IUbicacionActivoDao;

@Service
public class UbicacionActivoServiceImpl implements IUbicacionActivoService {

	@Autowired
	private IUbicacionActivoDao activoDao;
	
	@Override
	public List<UbicacionActivo> findAll() {

		return (List<UbicacionActivo>) activoDao.findAll();
	}

	@Override
	public UbicacionActivo findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UbicacionActivo save(UbicacionActivo ubicacionactivo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UbicacionActivo findByDescripcion(String descripcion) {
		
		return activoDao.findByDescripcion(descripcion);
	}

	

}

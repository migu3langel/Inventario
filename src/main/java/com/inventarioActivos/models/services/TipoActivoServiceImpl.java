package com.inventarioActivos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventarioActivos.model.entity.TipoActivo;
import com.inventarioActivos.models.dao.ITipoActivoDao;

 @Service
public class TipoActivoServiceImpl implements ITipoActivoService{
	@Autowired
	private ITipoActivoDao tipoDao;
	
	@Override
	public List<TipoActivo> findAll() {
		
		return  (List<TipoActivo>) tipoDao.findAll();
	}

	@Override
	public TipoActivo findById(Long id) {
		
		return null;
	}

	@Override
	public TipoActivo save(TipoActivo tipoActivo) {
		// TODO Auto-generated method stub
		return null;
	}

}

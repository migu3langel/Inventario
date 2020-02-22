package com.inventarioActivos.models.services;

import java.util.List;

import com.inventarioActivos.model.entity.TipoActivo;

public interface ITipoActivoService {

	
	public List<TipoActivo> findAll();
	
	public TipoActivo findById(Long id);
	
	public TipoActivo save(TipoActivo tipoActivo);
}

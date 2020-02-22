package com.inventarioActivos.models.services;

import java.util.List;

import com.inventarioActivos.model.entity.UbicacionActivo;

public interface IUbicacionActivoService {

	
	public List<UbicacionActivo> findAll();
	
	public UbicacionActivo findById(Integer id);
	


	public UbicacionActivo findByDescripcion(String descripcion);


	public UbicacionActivo save(UbicacionActivo ubicacionactivo);
	
	
}

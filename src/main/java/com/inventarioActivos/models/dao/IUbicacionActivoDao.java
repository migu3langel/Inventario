package com.inventarioActivos.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.inventarioActivos.model.entity.UbicacionActivo;

public interface IUbicacionActivoDao extends CrudRepository<UbicacionActivo, Integer>{
	
public UbicacionActivo findByDescripcion(String descripcion);

	
	
}

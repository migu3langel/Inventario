package com.inventarioActivos.models.services;

import java.util.List;
import com.inventarioActivos.model.entity.Activo;

public interface IActivoService {

	
	public List<Activo> findAll();
	
	public Activo findById(String id);
	


	public Activo save(Activo activo);
	
	
}

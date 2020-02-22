package com.inventarioActivos.models.services;

import java.util.List;
import java.util.Optional;

import com.inventarioActivos.model.entity.EmpresaActivo;


public interface IEmpresaActivoService {

	
	public List<EmpresaActivo> findAll();
	
	public Optional<EmpresaActivo> findById(Long id);

	public EmpresaActivo save(EmpresaActivo empresaActivo);

	public EmpresaActivo findByDescripcion(String descripcion);
	

	
	
	
}

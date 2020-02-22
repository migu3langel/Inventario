package com.inventarioActivos.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.inventarioActivos.model.entity.EmpresaActivo;


public interface IEmpresaActivoDao extends CrudRepository<EmpresaActivo, Long>{

	public EmpresaActivo findByDescripcion(String descripcion);

	

}

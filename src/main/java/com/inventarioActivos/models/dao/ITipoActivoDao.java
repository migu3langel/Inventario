package com.inventarioActivos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.inventarioActivos.model.entity.TipoActivo;

public interface ITipoActivoDao extends CrudRepository<TipoActivo,Long>{

}

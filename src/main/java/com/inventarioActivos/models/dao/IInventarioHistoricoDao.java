package com.inventarioActivos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.inventarioActivos.model.entity.InventarioHistorico;

public interface IInventarioHistoricoDao extends CrudRepository<InventarioHistorico,Long>{

}

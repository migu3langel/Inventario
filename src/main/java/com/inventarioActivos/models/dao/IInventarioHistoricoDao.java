package com.inventarioActivos.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inventarioActivos.dto.InventarioDto;
import com.inventarioActivos.model.entity.InventarioHistorico;

public interface IInventarioHistoricoDao extends CrudRepository<InventarioHistorico,Long>{





}

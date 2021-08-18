package com.inventarioActivos.models.services;

import com.inventarioActivos.dto.InventarioDto;
import com.inventarioActivos.model.entity.InventarioHistorico;

import java.util.List;


public interface IInventarioHistoricoService {

public List<InventarioHistorico> findAll();

public InventarioHistorico save(InventarioHistorico inventario);

public InventarioHistorico findById(long idHistorico);

public void saveAll(List<InventarioDto> inventario);




	
	
}

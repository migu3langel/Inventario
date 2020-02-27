package com.inventarioActivos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventarioActivos.model.entity.InventarioHistorico;
import com.inventarioActivos.models.dao.IInventarioHistoricoDao;

@Service
public class InventarioHistoricoImpl implements IInventarioHistoricoService {

	@Autowired
	public IInventarioHistoricoDao inventarioDao;
	
	@Override
	public List<InventarioHistorico> findAll() {
		
		return (List<InventarioHistorico>) inventarioDao.findAll();
	}

}

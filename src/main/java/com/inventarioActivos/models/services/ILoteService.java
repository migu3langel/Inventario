package com.inventarioActivos.models.services;

import java.util.List;
import java.util.Optional;

import com.inventarioActivos.model.entity.Lote;

public interface ILoteService {

	
	public List<Lote> findAll();
	
	public Optional<Lote> findById(Integer id);
	

	public Lote max();
	
	
}

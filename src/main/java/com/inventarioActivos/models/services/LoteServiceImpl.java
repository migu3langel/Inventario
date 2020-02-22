package com.inventarioActivos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.inventarioActivos.model.entity.Lote;

import com.inventarioActivos.models.dao.ILoteDao;

@Service
public class LoteServiceImpl implements ILoteService {

	@Autowired
	private ILoteDao loteDao;
	
	@Override
	public List<Lote> findAll() {

		return (List<Lote>) loteDao.findAll();
	}

	@Override
	public Optional<Lote> findById(Integer id) {
		
		return loteDao.findById(id);
	}
	
	public Lote max() {
		Lote lote = new Lote();
		lote.setIdLote(loteDao.max());;
		return lote;
		
	}

}

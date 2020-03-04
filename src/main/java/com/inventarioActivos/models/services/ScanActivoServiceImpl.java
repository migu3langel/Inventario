package com.inventarioActivos.models.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.inventarioActivos.model.entity.ScanActivo;

import com.inventarioActivos.models.dao.IScanActivoDao;


@Service
public class ScanActivoServiceImpl implements IScanActivoService {

	@Autowired
	private IScanActivoDao scanActivoDao;
	
	@Override
	public List<ScanActivo> findAll() {

		return  (List<ScanActivo>) scanActivoDao.findAll();
	}

	@Override
	public Optional<ScanActivo> findById(Integer id) {
		
		return scanActivoDao.findById(id);
	}

	@Override
	public ScanActivo save(ScanActivo scanActivo) {
	
		return scanActivoDao.save(scanActivo);
	}
	
	@Override
	public List<ScanActivo> getAllBetweenDates(Date startDate,Date endDate){
		return scanActivoDao.getAllBetweenDates(startDate, endDate);
		
		
	}
	

}

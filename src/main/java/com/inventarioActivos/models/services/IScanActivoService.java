package com.inventarioActivos.models.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.inventarioActivos.model.entity.ScanActivo;

public interface IScanActivoService {

	
	public List<ScanActivo> findAll();
	
	public Optional<ScanActivo> findById(Integer id);
	
	public ScanActivo save(ScanActivo scanactivo);
	
	public List<ScanActivo> getAllBetweenDates(Date startDate,Date endDate);
	
}

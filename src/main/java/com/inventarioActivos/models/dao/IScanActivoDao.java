package com.inventarioActivos.models.dao;


import org.springframework.data.repository.CrudRepository;



import com.inventarioActivos.model.entity.ScanActivo;

public interface IScanActivoDao extends CrudRepository<ScanActivo, Integer>{

	
}

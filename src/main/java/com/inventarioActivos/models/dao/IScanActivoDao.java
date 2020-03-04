package com.inventarioActivos.models.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.inventarioActivos.model.entity.ScanActivo;

public interface IScanActivoDao extends CrudRepository<ScanActivo, Integer>{

	@Query(value = "from ScanActivo t where fechaScan BETWEEN :startDate AND :endDate")
	public List<ScanActivo> getAllBetweenDates(@Param("startDate")Date startDate,@Param("endDate")Date endDate);
}

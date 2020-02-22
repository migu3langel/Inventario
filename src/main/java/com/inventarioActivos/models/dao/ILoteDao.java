package com.inventarioActivos.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.inventarioActivos.model.entity.Lote;

public interface ILoteDao extends CrudRepository<Lote, Integer>{

	
	@Query(value ="SELECT max(idLote) FROM Lote")
	public Integer max();
}

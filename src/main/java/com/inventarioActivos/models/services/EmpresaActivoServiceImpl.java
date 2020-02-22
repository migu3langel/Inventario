package com.inventarioActivos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventarioActivos.model.entity.EmpresaActivo;
import com.inventarioActivos.models.dao.IEmpresaActivoDao;


@Service
public class EmpresaActivoServiceImpl implements IEmpresaActivoService {

	@Autowired
	private IEmpresaActivoDao EmpresaActivoDao;
	
	@Override
	public List<EmpresaActivo> findAll() {

		return (List<EmpresaActivo>) EmpresaActivoDao.findAll();
	}

	@Override
	public Optional<EmpresaActivo> findById(Long id) {

		return EmpresaActivoDao.findById(id);
	}

	@Override
	public EmpresaActivo save(EmpresaActivo empresaActivo) {
	
		return EmpresaActivoDao.save(empresaActivo);
	}

	@Override
	public EmpresaActivo findByDescripcion(String descripcion) {
		
		return EmpresaActivoDao.findByDescripcion(descripcion);
	}


	

}

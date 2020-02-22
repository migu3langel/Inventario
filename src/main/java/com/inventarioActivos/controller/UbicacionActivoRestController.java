package com.inventarioActivos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.inventarioActivos.model.entity.UbicacionActivo;

import com.inventarioActivos.models.services.IUbicacionActivoService;

@RestController
@RequestMapping("/api")
public class UbicacionActivoRestController {

	@Autowired
	private IUbicacionActivoService activoService;
	
	@CrossOrigin(origins="http://localhost:4200")  
	@GetMapping("/ubicacion")
	public List<UbicacionActivo> index() {

		return activoService.findAll();

	}

}

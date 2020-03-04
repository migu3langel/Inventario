package com.inventarioActivos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioActivos.model.entity.InventarioHistorico;

import com.inventarioActivos.models.services.IInventarioHistoricoService;

@RestController
@RequestMapping("/api")
public class InventarioHistoricoRestController {

	@Autowired
	private IInventarioHistoricoService historicoService;
	
	@CrossOrigin(origins="http://localhost:4200")  
	@GetMapping("/historico")
	public List<InventarioHistorico> index() {

		return historicoService.findAll();

	}

}

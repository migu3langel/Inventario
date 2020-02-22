package com.inventarioActivos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.inventarioActivos.model.entity.Lote;

import com.inventarioActivos.models.services.ILoteService;

@RestController
@RequestMapping("/api")
public class LoteRestController {

	@Autowired
	private ILoteService loteService;
	
	@GetMapping("/lote")
	public List<Lote> index(){
		
		return loteService.findAll();
		
	}
	
	@GetMapping("/lote/{id}")
	public Optional<Lote> lote(@PathVariable Integer id) {
		
		// control cuando venga null
		return loteService.findById(id);
	
	}
	
	@GetMapping("/lote/max")
	public Lote max() {
		
		return loteService.max();
	}
	
}

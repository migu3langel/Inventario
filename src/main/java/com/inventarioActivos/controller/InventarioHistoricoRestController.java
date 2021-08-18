package com.inventarioActivos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioActivos.dto.InventarioDto;
import com.inventarioActivos.model.entity.InventarioHistorico;

import com.inventarioActivos.models.services.IInventarioHistoricoService;

@RestController
@RequestMapping("/api")
public class InventarioHistoricoRestController {

	@Autowired
	private IInventarioHistoricoService historicoService;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/historico")
	public List<InventarioHistorico> index() {

		return historicoService.findAll();

	}

	@PostMapping("/historico")
	@ResponseStatus(HttpStatus.CREATED)
	public void  guardar(@RequestBody List<InventarioDto> inventarioHistoricoDto){
		

		historicoService.saveAll(inventarioHistoricoDto);
		
		
	}

}

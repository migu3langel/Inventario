package com.inventarioActivos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioActivos.model.entity.TipoActivo;
import com.inventarioActivos.models.services.ITipoActivoService;

@RestController
@RequestMapping("/api")
public class TipoActivoController {

	@Autowired
	private ITipoActivoService tipoService;
	
	@CrossOrigin(origins="http://localhost:4200") 
	@GetMapping("/tipo")
	public List<TipoActivo> index(){
		
		return tipoService.findAll();
	}
}



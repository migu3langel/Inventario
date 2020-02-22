package com.inventarioActivos.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioActivos.dto.ScanActivoDto;
import com.inventarioActivos.model.entity.Activo;
import com.inventarioActivos.model.entity.Lote;
import com.inventarioActivos.model.entity.ScanActivo;

import com.inventarioActivos.models.services.IScanActivoService;

@RestController
@RequestMapping("/api")
public class ScanActivoRestController {

	@Autowired
	private IScanActivoService scanActivoService;
	@CrossOrigin(origins="http://localhost:4200")  
	@GetMapping("/scan")
	public List<ScanActivo> index(){
		
		return scanActivoService.findAll();
		
	}
	
	@GetMapping("/scan/{id}")
	public Optional<ScanActivo> activo(@PathVariable Integer id) {
		
		// control cuando venga null
		return scanActivoService.findById(id);
	
	}
	
	@PostMapping("/scan")
	@ResponseStatus(HttpStatus.CREATED)
	public ScanActivo create(@RequestBody ScanActivoDto scanActivo) {
		
		try {
		ScanActivo scanactivo = new ScanActivo();
		Activo activo = new Activo();
		Lote lote = new Lote();
		
		activo.setCodigoActivo(scanActivo.getCodigoActivo());
		lote.setIdLote(scanActivo.getIdLote());
		
		scanactivo.setActivo(activo);
		scanactivo.setLoteActivo(lote);
		scanactivo.setFechaScan(new Date());
		System.out.println(new Date());
		scanActivoService.save(scanactivo);

		}
		catch(Exception e) {    e.printStackTrace();} ;
		
			
		return null;
	}
	
	
	
}

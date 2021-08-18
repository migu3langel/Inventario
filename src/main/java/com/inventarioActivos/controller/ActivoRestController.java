package com.inventarioActivos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioActivos.dto.ActivoDto;
import com.inventarioActivos.dto.ActivoSavedto;
import com.inventarioActivos.model.entity.Activo;
import com.inventarioActivos.model.entity.EmpresaActivo;
import com.inventarioActivos.model.entity.TipoActivo;
import com.inventarioActivos.model.entity.UbicacionActivo;
import com.inventarioActivos.models.services.IActivoService;

import com.inventarioActivos.models.services.IUbicacionActivoService;

@RestController
@RequestMapping("/api")
public class ActivoRestController {

	@Autowired
	private IActivoService activoService;

	@Autowired
	private IUbicacionActivoService autoservice;
	

	
	@CrossOrigin(origins="http://localhost:4200")  
	@GetMapping("/activos")
	public List<Activo> index() {

		return activoService.findAll();

	}

	@GetMapping("/activo/{id}")
	public Activo activo(@PathVariable String id) {

		// control cuando venga null
		return activoService.findById(id);

	}

	@PutMapping("/activo/{id}/{descripcion}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Activo update(@RequestBody ActivoDto activo, @PathVariable String id, @PathVariable String idUbicacion) {
		try {
		
			Activo activonew = activoService.findById(id);
			UbicacionActivo ubicacionActivo = new UbicacionActivo();
			UbicacionActivo hola = autoservice.findByDescripcion(idUbicacion);
			System.out.println("ubicacio"+hola.getIdUbicacion());
			ubicacionActivo.setIdUbicacion(hola.getIdUbicacion());
			activonew.setDescripcion(activo.getDescripcion());
			activonew.setCustodio(activo.getCustodio());
			activonew.setUbicacionActivo(ubicacionActivo);
			
			activoService.save(acivonew);

	
			return null;
		} catch (Exception hola) {
	
			return null;
		}

	}
	
	@CrossOrigin(origins="http://localhost:4200") 
	@PostMapping("/activo")
	@ResponseStatus(HttpStatus.CREATED)
	public Activo create(@RequestBody ActivoSavedto activodto) {
		System.out.println(activodto);
		Activo activo = new Activo();
		EmpresaActivo empresa = new EmpresaActivo();
		TipoActivo tipo = new TipoActivo();
		UbicacionActivo ubicacion = new UbicacionActivo();
		
		
		System.out.println("paso"+activodto.getCodigoActivo());
		empresa.setIdEmpresa(activodto.getIdEmpresa());
		tipo.setIdTipo(activodto.getIdTipo());
		ubicacion.setIdUbicacion(activodto.getIdUbicacion());
		activo.setCodigoActivo(activodto.getCodigoActivo());
		activo.setDescripcion(activodto.getDescripcion());
		activo.setCustodio(activodto.getCustodio());
		activo.setEmpresaActivo(empresa);
		activo.setTipoActivo(tipo);
		activo.setUbicacionActivo(ubicacion);
		activoService.save(activo);

		}}
		
		return null;
		
		
	}

}

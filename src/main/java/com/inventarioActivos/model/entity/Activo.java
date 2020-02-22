package com.inventarioActivos.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Set;


/**
 * The persistent class for the ACTIVO database table.
 * 
 */
@Entity
public class Activo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODIGO_ACTIVO")
  	private String codigoActivo;

	private String custodio;

	private String descripcion;

	//bi-directional many-to-one association to EmpresaActivo
	@ManyToOne
	@JoinColumn(name="EMPRESA")
	private EmpresaActivo empresaActivo;

	//bi-directional many-to-one association to TipoActivo
	@ManyToOne
	@JoinColumn(name="TIPO")
	private TipoActivo tipoActivo;

	//bi-directional many-to-one association to UbicacionActivo
	@ManyToOne
	@JoinColumn(name="UBICACION")
	private UbicacionActivo ubicacionActivo;

	//bi-directional many-to-one association to InventarioHistorico
	@JsonBackReference
	@OneToMany(mappedBy="activo")
	private Set<InventarioHistorico> inventarioHistoricos;

	//bi-directional many-to-one association to ScanActivo
	@JsonBackReference
	@OneToMany(mappedBy="activo")
	private Set<ScanActivo> scanActivos;

	public Activo() {
	}

	public String getCodigoActivo() {
		return this.codigoActivo;
	}

	public void setCodigoActivo(String codigoActivo) {
		this.codigoActivo = codigoActivo;
	}

	public String getCustodio() {
		return this.custodio;
	}

	public void setCustodio(String custodio) {
		this.custodio = custodio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public EmpresaActivo getEmpresaActivo() {
		return this.empresaActivo;
	}

	public void setEmpresaActivo(EmpresaActivo empresaActivo) {
		this.empresaActivo = empresaActivo;
	}

	public TipoActivo getTipoActivo() {
		return this.tipoActivo;
	}

	public void setTipoActivo(TipoActivo tipoActivo) {
		this.tipoActivo = tipoActivo;
	}

	public UbicacionActivo getUbicacionActivo() {
		return this.ubicacionActivo;
	}

	public void setUbicacionActivo(UbicacionActivo ubicacionActivo) {
		this.ubicacionActivo = ubicacionActivo;
	}

	public Set<InventarioHistorico> getInventarioHistoricos() {
		return this.inventarioHistoricos;
	}

	public void setInventarioHistoricos(Set<InventarioHistorico> inventarioHistoricos) {
		this.inventarioHistoricos = inventarioHistoricos;
	}

	public InventarioHistorico addInventarioHistorico(InventarioHistorico inventarioHistorico) {
		getInventarioHistoricos().add(inventarioHistorico);
		inventarioHistorico.setActivo(this);

		return inventarioHistorico;
	}

	public InventarioHistorico removeInventarioHistorico(InventarioHistorico inventarioHistorico) {
		getInventarioHistoricos().remove(inventarioHistorico);
		inventarioHistorico.setActivo(null);

		return inventarioHistorico;
	}

	public Set<ScanActivo> getScanActivos() {
		return this.scanActivos;
	}

	public void setScanActivos(Set<ScanActivo> scanActivos) {
		this.scanActivos = scanActivos;
	}

	public ScanActivo addScanActivo(ScanActivo scanActivo) {
		getScanActivos().add(scanActivo);
		scanActivo.setActivo(this);

		return scanActivo;
	}

	public ScanActivo removeScanActivo(ScanActivo scanActivo) {
		getScanActivos().remove(scanActivo);
		scanActivo.setActivo(null);

		return scanActivo;
	}

}
package com.inventarioActivos.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the LOTE_ACTIVO database table.
 * 
 */
@Entity
@Table(name="LOTE_ACTIVO")
public class Lote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_LOTE")

	private long idLote;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to ScanActivo
	@JsonBackReference
	@OneToMany(mappedBy="loteActivo")
	private Set<ScanActivo> scanActivos;

	public Lote() {
	}

	public long getIdLote() {
		return this.idLote;
	}

	public void setIdLote(long idLote) {
		this.idLote = idLote;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Set<ScanActivo> getScanActivos() {
		return this.scanActivos;
	}

	public void setScanActivos(Set<ScanActivo> scanActivos) {
		this.scanActivos = scanActivos;
	}

	public ScanActivo addScanActivo(ScanActivo scanActivo) {
		getScanActivos().add(scanActivo);
		scanActivo.setLoteActivo(this);

		return scanActivo;
	}

	public ScanActivo removeScanActivo(ScanActivo scanActivo) {
		getScanActivos().remove(scanActivo);
		scanActivo.setLoteActivo(null);

		return scanActivo;
	}

}
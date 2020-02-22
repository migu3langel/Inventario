package com.inventarioActivos.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the SCAN_ACTIVO database table.
 * 
 */
@Entity
@Table(name="SCAN_ACTIVO")
public class ScanActivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SCAN")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "SEQUENCE_SCAN", allocationSize = 1, name = "CUST_SEQ")
	private long idScan;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_SCAN")
	private Date fechaScan;

	//bi-directional many-to-one association to Activo
	@ManyToOne
	@JoinColumn(name="CODIGO_ACTIVO")
	private Activo activo;

	//bi-directional many-to-one association to LoteActivo
	@ManyToOne
	@JoinColumn(name="ID_LOTE")
	private Lote loteActivo;

	public ScanActivo() {
	}

	public long getIdScan() {
		return this.idScan;
	}

	public void setIdScan(long idScan) {
		this.idScan = idScan;
	}

	public Date getFechaScan() {
		return this.fechaScan;
	}

	public void setFechaScan(Date fechaScan) {
		this.fechaScan = fechaScan;
	}

	public Activo getActivo() {
		return this.activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	public Lote getLoteActivo() {
		return this.loteActivo;
	}

	public void setLoteActivo(Lote loteActivo) {
		this.loteActivo = loteActivo;
	}

}
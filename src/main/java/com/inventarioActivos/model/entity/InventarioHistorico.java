package com.inventarioActivos.model.entity;

import java.io.Serializable;
import javax.persistence.*;

//import com.fasterxml.jackson.annotation.JsonBackReference;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the INVENTARIO_HISTORICO database table.
 * 
 */
@Entity
@Table(name = "INVENTARIO_HISTORICO")
public class InventarioHistorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_HISTORICO")
	private long idHistorico;

	@Column(name = "CUSTODIO_ANTERIOR")
	private String custodioAnterior;

	@Column(name = "CUSTODIO_NUEVO")
	private String custodioNuevo;

	@Column(name = "DESCRIPCION_ANTERIOR")
	private String descripcionAnterior;

	@Column(name = "DESCRIPCION_NUEVA")
	private String descripcionNueva;

	@Column(name = "EMPRESA_ANTERIOR")
	private BigDecimal empresaAnterior;

	@Column(name = "EMPRESA_NUEVA")
	private BigDecimal empresaNueva;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	
	private BigDecimal realizado;
	
	@Column(name = "TIPO_ANTERIOR")
	private BigDecimal tipoAnterior;

	public BigDecimal getRealizado() {
		return realizado;
	}

	public void setRealizado(BigDecimal realizado) {
		this.realizado = realizado;
	}

	@Column(name = "TIPO_NUEVO")
	private BigDecimal tipoNuevo;

	// bi-directional many-to-one association to Activo

	@ManyToOne
	@JoinColumn(name = "CODIGO_ACTIVO")
	private Activo activo;

	// bi-directional many-to-one association to UbicacionActivo
	@ManyToOne
	@JoinColumn(name = "UBICACION_ANTERIOR")
	private UbicacionActivo ubicacionActivo1;

	// bi-directional many-to-one association to UbicacionActivo
	@ManyToOne
	@JoinColumn(name = "UBICACION_NUEVA")
	private UbicacionActivo ubicacionActivo2;

	public InventarioHistorico() {
	}

	public long getIdHistorico() {
		return this.idHistorico;
	}

	public void setIdHistorico(long idHistorico) {
		this.idHistorico = idHistorico;
	}

	public String getCustodioAnterior() {
		return this.custodioAnterior;
	}

	public void setCustodioAnterior(String custodioAnterior) {
		this.custodioAnterior = custodioAnterior;
	}

	public String getCustodioNuevo() {
		return this.custodioNuevo;
	}

	public void setCustodioNuevo(String custodioNuevo) {
		this.custodioNuevo = custodioNuevo;
	}

	public String getDescripcionAnterior() {
		return this.descripcionAnterior;
	}

	public void setDescripcionAnterior(String descripcionAnterior) {
		this.descripcionAnterior = descripcionAnterior;
	}

	public String getDescripcionNueva() {
		return this.descripcionNueva;
	}

	public void setDescripcionNueva(String descripcionNueva) {
		this.descripcionNueva = descripcionNueva;
	}

	public BigDecimal getEmpresaAnterior() {
		return this.empresaAnterior;
	}

	public void setEmpresaAnterior(BigDecimal empresaAnterior) {
		this.empresaAnterior = empresaAnterior;
	}

	public BigDecimal getEmpresaNueva() {
		return this.empresaNueva;
	}

	public void setEmpresaNueva(BigDecimal empresaNueva) {
		this.empresaNueva = empresaNueva;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTipoAnterior() {
		return this.tipoAnterior;
	}

	public void setTipoAnterior(BigDecimal tipoAnterior) {
		this.tipoAnterior = tipoAnterior;
	}

	public BigDecimal getTipoNuevo() {
		return this.tipoNuevo;
	}

	public void setTipoNuevo(BigDecimal tipoNuevo) {
		this.tipoNuevo = tipoNuevo;
	}

	public Activo getActivo() {
		return this.activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	public UbicacionActivo getUbicacionActivo1() {
		return this.ubicacionActivo1;
	}

	public void setUbicacionActivo1(UbicacionActivo ubicacionActivo1) {
		this.ubicacionActivo1 = ubicacionActivo1;
	}

	public UbicacionActivo getUbicacionActivo2() {
		return this.ubicacionActivo2;
	}

	public void setUbicacionActivo2(UbicacionActivo ubicacionActivo2) {
		this.ubicacionActivo2 = ubicacionActivo2;
	}
}
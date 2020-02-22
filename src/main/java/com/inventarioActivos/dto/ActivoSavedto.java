package com.inventarioActivos.dto;

public class ActivoSavedto {
	private String codigoActivo;
	private String custodio;
	public String getCustodio() {
		return custodio;
	}
	public void setCustodio(String custodio) {
		this.custodio = custodio;
	}
	public String getCodigoActivo() {
		return codigoActivo;
	}
	public void setCodigoActivo(String codigoActivo) {
		this.codigoActivo = codigoActivo;
	}
	private Long idUbicacion;
	private Long idTipo;
	private Long idEmpresa;
	public Long getIdUbicacion() {
		return idUbicacion;
	}
	public void setIdUbicacion(Long idUbicacion) {
		this.idUbicacion = idUbicacion;
	}
	public Long getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	private String descripcion;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}

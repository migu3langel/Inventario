package com.inventarioActivos.dto;

import java.math.BigDecimal;

public class InventarioDto {

	private long idHistorico;


	public long getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(long idHistorico) {
		this.idHistorico = idHistorico;
	}

	private BigDecimal realizado;


	public BigDecimal getRealizado() {
		return realizado;
	}

	public void setRealizado(BigDecimal realizado) {
		this.realizado = realizado;
	}




}

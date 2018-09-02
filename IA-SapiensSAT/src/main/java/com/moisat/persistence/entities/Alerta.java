package com.moisat.persistence.entities;
// Generated Sep 1, 2018 11:44:50 AM by Hibernate Tools 5.2.3.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Alerta generated by hbm2java
 */
@Entity
@Table(name = "ALERTA", schema = "SATFING")
public class Alerta implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long codigoAlerta;
	private FactorRiesgo factorRiesgo;
	private String criticidad;
	private String temporalidad;
	private Serializable fechaInicio;
	private Serializable fechaCierre;
	private Set<ProtocoloAtencion> protocoloAtencions = new HashSet<ProtocoloAtencion>(0);

	public Alerta() {
	}

	public Alerta(long codigoAlerta, FactorRiesgo factorRiesgo) {
		this.codigoAlerta = codigoAlerta;
		this.factorRiesgo = factorRiesgo;
	}

	public Alerta(long codigoAlerta, FactorRiesgo factorRiesgo, String criticidad, String temporalidad,
			Serializable fechaInicio, Serializable fechaCierre, Set<ProtocoloAtencion> protocoloAtencions) {
		this.codigoAlerta = codigoAlerta;
		this.factorRiesgo = factorRiesgo;
		this.criticidad = criticidad;
		this.temporalidad = temporalidad;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
		this.protocoloAtencions = protocoloAtencions;
	}

	@Id

	@Column(name = "CODIGO_ALERTA", unique = true, nullable = false, precision = 10, scale = 0)
	public long getCodigoAlerta() {
		return this.codigoAlerta;
	}

	public void setCodigoAlerta(long codigoAlerta) {
		this.codigoAlerta = codigoAlerta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODIGO_FACTOR", nullable = false)
	public FactorRiesgo getFactorRiesgo() {
		return this.factorRiesgo;
	}

	public void setFactorRiesgo(FactorRiesgo factorRiesgo) {
		this.factorRiesgo = factorRiesgo;
	}

	@Column(name = "CRITICIDAD", length = 40)
	public String getCriticidad() {
		return this.criticidad;
	}

	public void setCriticidad(String criticidad) {
		this.criticidad = criticidad;
	}

	@Column(name = "TEMPORALIDAD", length = 100)
	public String getTemporalidad() {
		return this.temporalidad;
	}

	public void setTemporalidad(String temporalidad) {
		this.temporalidad = temporalidad;
	}

	@Column(name = "FECHA_INICIO")
	public Serializable getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Serializable fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name = "FECHA_CIERRE")
	public Serializable getFechaCierre() {
		return this.fechaCierre;
	}

	public void setFechaCierre(Serializable fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "alerta")
	public Set<ProtocoloAtencion> getProtocoloAtencions() {
		return this.protocoloAtencions;
	}

	public void setProtocoloAtencions(Set<ProtocoloAtencion> protocoloAtencions) {
		this.protocoloAtencions = protocoloAtencions;
	}

}

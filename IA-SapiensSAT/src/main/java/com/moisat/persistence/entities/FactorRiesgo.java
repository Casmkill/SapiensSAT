package com.moisat.persistence.entities;
// Generated Sep 1, 2018 11:44:50 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FactorRiesgo generated by hbm2java
 */
@Entity
@Table(name = "FACTOR_RIESGO", schema = "SATFING")
public class FactorRiesgo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long codigoFactor;
	private String especificacion;
	private String tipoalerta;
	private Set<Alerta> alertas = new HashSet<Alerta>(0);

	public FactorRiesgo() {
	}

	public FactorRiesgo(long codigoFactor) {
		this.codigoFactor = codigoFactor;
	}

	public FactorRiesgo(long codigoFactor, String especificacion, String tipoalerta, Set<Alerta> alertas) {
		this.codigoFactor = codigoFactor;
		this.especificacion = especificacion;
		this.tipoalerta = tipoalerta;
		this.alertas = alertas;
	}

	@Id

	@Column(name = "CODIGO_FACTOR", unique = true, nullable = false, precision = 10, scale = 0)
	public long getCodigoFactor() {
		return this.codigoFactor;
	}

	public void setCodigoFactor(long codigoFactor) {
		this.codigoFactor = codigoFactor;
	}

	@Column(name = "ESPECIFICACION")
	public String getEspecificacion() {
		return this.especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	@Column(name = "TIPOALERTA", length = 100)
	public String getTipoalerta() {
		return this.tipoalerta;
	}

	public void setTipoalerta(String tipoalerta) {
		this.tipoalerta = tipoalerta;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "factorRiesgo")
	public Set<Alerta> getAlertas() {
		return this.alertas;
	}

	public void setAlertas(Set<Alerta> alertas) {
		this.alertas = alertas;
	}

}

package com.moisat.persistence.entities;
// Generated Aug 30, 2018 5:54:55 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ConsejeroId generated by hbm2java
 */
@Embeddable
public class ConsejeroId implements java.io.Serializable {

	private String departamento;
	private long codigoPersona;
	private String ciclo;

	public ConsejeroId() {
	}

	public ConsejeroId(String departamento, long codigoPersona) {
		this.departamento = departamento;
		this.codigoPersona = codigoPersona;
	}

	public ConsejeroId(String departamento, long codigoPersona, String ciclo) {
		this.departamento = departamento;
		this.codigoPersona = codigoPersona;
		this.ciclo = ciclo;
	}

	@Column(name = "DEPARTAMENTO", nullable = false, length = 510)
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Column(name = "CODIGO_PERSONA", unique = true, nullable = false, precision = 10, scale = 0)
	public long getCodigoPersona() {
		return this.codigoPersona;
	}

	public void setCodigoPersona(long codigoPersona) {
		this.codigoPersona = codigoPersona;
	}

	@Column(name = "CICLO", length = 40)
	public String getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConsejeroId))
			return false;
		ConsejeroId castOther = (ConsejeroId) other;

		return ((this.getDepartamento() == castOther.getDepartamento()) || (this.getDepartamento() != null
				&& castOther.getDepartamento() != null && this.getDepartamento().equals(castOther.getDepartamento())))
				&& (this.getCodigoPersona() == castOther.getCodigoPersona())
				&& ((this.getCiclo() == castOther.getCiclo()) || (this.getCiclo() != null
						&& castOther.getCiclo() != null && this.getCiclo().equals(castOther.getCiclo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDepartamento() == null ? 0 : this.getDepartamento().hashCode());
		result = 37 * result + (int) this.getCodigoPersona();
		result = 37 * result + (getCiclo() == null ? 0 : this.getCiclo().hashCode());
		return result;
	}

}

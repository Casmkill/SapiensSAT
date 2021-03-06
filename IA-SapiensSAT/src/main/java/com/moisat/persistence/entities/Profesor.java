package com.moisat.persistence.entities;
// Generated Sep 1, 2018 11:44:50 AM by Hibernate Tools 5.2.3.Final

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
import javax.persistence.UniqueConstraint;

/**
 * Profesor generated by hbm2java
 */
@Entity
@Table(name = "PROFESOR", schema = "SATFING", uniqueConstraints = @UniqueConstraint(columnNames = "CODIGO_PERSONA"))
public class Profesor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long codigoProfesor;
	private Departamento departamento;
	private Persona persona;
	private Set<Clase> clases = new HashSet<Clase>(0);

	public Profesor() {
	}

	public Profesor(long codigoProfesor, Departamento departamento, Persona persona) {
		this.codigoProfesor = codigoProfesor;
		this.departamento = departamento;
		this.persona = persona;
	}

	public Profesor(long codigoProfesor, Departamento departamento, Persona persona, Set<Clase> clases) {
		this.codigoProfesor = codigoProfesor;
		this.departamento = departamento;
		this.persona = persona;
		this.clases = clases;
	}

	@Id

	@Column(name = "CODIGO_PROFESOR", unique = true, nullable = false, precision = 10, scale = 0)
	public long getCodigoProfesor() {
		return this.codigoProfesor;
	}

	public void setCodigoProfesor(long codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODIGO_DEPARTAMENTO", nullable = false)
	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODIGO_PERSONA", unique = true, nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profesor")
	public Set<Clase> getClases() {
		return this.clases;
	}

	public void setClases(Set<Clase> clases) {
		this.clases = clases;
	}

}

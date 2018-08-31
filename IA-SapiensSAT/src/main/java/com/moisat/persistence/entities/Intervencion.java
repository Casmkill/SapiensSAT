package com.moisat.persistence.entities;
// Generated Aug 30, 2018 5:54:55 PM by Hibernate Tools 5.2.3.Final

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
 * Intervencion generated by hbm2java
 */
@Entity
@Table(name = "INTERVENCION", schema = "SATFING", uniqueConstraints = @UniqueConstraint(columnNames = "CODIGO_PROTOCOLO"))
public class Intervencion implements java.io.Serializable {

	private long codigoIntervencion;
	private ProtocoloAtencion protocoloAtencion;
	private String estadoIntervencion;
	private Set<Actor> actors = new HashSet(0);

	public Intervencion() {
	}

	public Intervencion(long codigoIntervencion, ProtocoloAtencion protocoloAtencion) {
		this.codigoIntervencion = codigoIntervencion;
		this.protocoloAtencion = protocoloAtencion;
	}

	public Intervencion(long codigoIntervencion, ProtocoloAtencion protocoloAtencion, String estadoIntervencion,
			Set actors) {
		this.codigoIntervencion = codigoIntervencion;
		this.protocoloAtencion = protocoloAtencion;
		this.estadoIntervencion = estadoIntervencion;
		this.actors = actors;
	}

	@Id

	@Column(name = "CODIGO_INTERVENCION", unique = true, nullable = false, precision = 10, scale = 0)
	public long getCodigoIntervencion() {
		return this.codigoIntervencion;
	}

	public void setCodigoIntervencion(long codigoIntervencion) {
		this.codigoIntervencion = codigoIntervencion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODIGO_PROTOCOLO", unique = true, nullable = false)
	public ProtocoloAtencion getProtocoloAtencion() {
		return this.protocoloAtencion;
	}

	public void setProtocoloAtencion(ProtocoloAtencion protocoloAtencion) {
		this.protocoloAtencion = protocoloAtencion;
	}

	@Column(name = "ESTADO_INTERVENCION", length = 100)
	public String getEstadoIntervencion() {
		return this.estadoIntervencion;
	}

	public void setEstadoIntervencion(String estadoIntervencion) {
		this.estadoIntervencion = estadoIntervencion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "intervencion")
	public Set<Actor> getActors() {
		return this.actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

}

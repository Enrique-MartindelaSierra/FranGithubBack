package com.fran.springboot.backend.eventos.models.entity;

// default package
// Generated 23 mar 2023 10:07:27 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario")
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String usuario;
	private String password;
	private DatosUsuario datosUsuario;
	@JsonIgnore
	private Set<Evento> eventos = new HashSet<Evento>(0);

	public Usuario() {
	}

	public Usuario(int id, String usuario, String password) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
	}

	public Usuario(int id, String usuario, String password, DatosUsuario datosUsuario, Set<Evento> eventos) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.datosUsuario = datosUsuario;
		this.eventos = eventos;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "usuario", nullable = false, length = 100)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "password", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "usuario")
	public DatosUsuario getDatosUsuario() {
		return this.datosUsuario;
	}

	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_asiste_evento", joinColumns = {
			@JoinColumn(name = "usuario", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "evento", nullable = false, updatable = false) })
	public Set<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

}

package com.fran.biblioteca2.entidades;

// default package
// Generated 15 mar 2023 10:39:43 by Hibernate Tools 6.1.5.Final

/**
 * Libros generated by hbm2java
 */
public class Libros implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Autores autores;
	private String titulo;

	public Libros() {
	}

	public Libros(int id) {
		this.id = id;
	}

	public Libros(int id, Autores autores, String titulo) {
		this.id = id;
		this.autores = autores;
		this.titulo = titulo;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Autores getAutores() {
		return this.autores;
	}

	public void setAutores(Autores autores) {
		this.autores = autores;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}

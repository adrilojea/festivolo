package com.festivolo.core.model;

import java.time.LocalDate;
import java.util.List;

public class Album {
	private String titulo;
	private List<GeneroMusical> generos;
	private LocalDate fechaPublicacion;
	private String notas;
	
	public Album() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<GeneroMusical> getGeneros() {
		return generos;
	}

	public void setGeneros(List<GeneroMusical> generos) {
		this.generos = generos;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}
	
}

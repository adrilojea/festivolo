package com.festivolo.core.model;

import java.util.List;

/**
 * @author adrilojea
 *
 */
public class Artista extends Usuario {

	private String nombre;
	private Direccion direccion;
	private Integer numSeguidores;
	private GeneroMusical genero;
	private List<Integrante> integrantes;
	private List<Album> albunes;
	private String biografia;
	private String web;

	public Artista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artista(String nombre, Direccion direccion, Integer numSeguidores, GeneroMusical genero,
			List<Integrante> integrantes, List<Album> albunes, String biografia, String web) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numSeguidores = numSeguidores;
		this.genero = genero;
		this.integrantes = integrantes;
		this.albunes = albunes;
		this.biografia = biografia;
		this.web = web;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Integer getNumSeguidores() {
		return numSeguidores;
	}

	public void setNumSeguidores(Integer numSeguidores) {
		this.numSeguidores = numSeguidores;
	}

	public GeneroMusical getGenero() {
		return genero;
	}

	public void setGenero(GeneroMusical genero) {
		this.genero = genero;
	}

	public List<Integrante> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<Integrante> integrantes) {
		this.integrantes = integrantes;
	}

	public List<Album> getAlbunes() {
		return albunes;
	}

	public void setAlbunes(List<Album> albunes) {
		this.albunes = albunes;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
}

package com.festivolo.core.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author adrilojea
 *
 */
@Entity
@Table(name = "artista", schema = "public")
public class Artista {

	@Id
	private int artistaId;
	@Column
	private String nombre;
	@OneToOne
	private Direccion direccion;
	@Column
	private Integer numSeguidores;
	@Column
	private Integer genero;
	@Column
	private String biografia;
	@Column
	private String web;
	@Column
	private String email;

	public Artista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artista(int artistaId, String nombre, Direccion direccion, Integer numSeguidores, Integer genero,
			String biografia, String web, String email) {
		super();
		this.artistaId = artistaId;
		this.nombre = nombre;
		this.direccion = direccion;
		this.numSeguidores = numSeguidores;
		this.genero = genero;
		this.biografia = biografia;
		this.web = web;
		this.email = email;
	}

	public int getArtistaId() {
		return artistaId;
	}

	public void setArtistaId(int artistaId) {
		this.artistaId = artistaId;
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

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
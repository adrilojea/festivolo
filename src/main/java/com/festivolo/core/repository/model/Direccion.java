package com.festivolo.core.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author adrilojea
 *
 */
@Entity
@Table(name = "direccion", schema = "public")
public class Direccion {
	@Id
	private int id;
	@Column
	private String ciudad;
	@Column
	private String provincia;
	@Column
	private String pais;

	public Direccion() {
		super();
	}

	public Direccion(int id, String ciudad, String provincia, String pais) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}

package com.festivolo.core.service.model;

/**
 * @author adrilojea
 *
 */
public class Direccion {
	private String ciudad;
	private String provincia;
	private String pais;

	public Direccion() {
		super();
	}

	public Direccion(String ciudad, String provincia, String pais) {
		super();
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
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

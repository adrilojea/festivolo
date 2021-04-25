package com.festivolo.core.model;

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
		// TODO Auto-generated constructor stub
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

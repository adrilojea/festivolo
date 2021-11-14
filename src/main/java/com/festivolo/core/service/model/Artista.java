package com.festivolo.core.service.model;

/**
 * @author adrilojea
 *
 */
public class Artista {

	private int artistaId;
	private String nombre;
	private String direccion;
	private Integer numSeguidores;
	private GeneroMusical genero;
	// private List<Integrante> integrantes;
	// private List<Album> albunes;
	private String biografia;
	private String web;
	private String email;

	public Artista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artista(int artistaId, String nombre, String direccion, Integer numSeguidores, GeneroMusical genero,
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
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
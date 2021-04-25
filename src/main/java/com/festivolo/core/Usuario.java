package com.festivolo.core;

import java.time.LocalDate;

public class Usuario {

	private int id;
	private String usuario;
	private String email;
	private String password;
	private LocalDate fechaCreacion;
	private UsuarioTipo tipo;

	public Usuario() {
		super();
	}

	public Usuario(int id, String usuario, String email, String password, LocalDate fechaCreacion) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.email = email;
		this.password = password;
		this.fechaCreacion = fechaCreacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public UsuarioTipo getTipo() {
		return tipo;
	}

	public void setTipo(UsuarioTipo tipo) {
		this.tipo = tipo;
	}

}

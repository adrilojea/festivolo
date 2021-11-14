package com.festivolo.core;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;

import com.festivolo.core.repository.ArtistaRepository;
import com.festivolo.core.service.model.Direccion;
import com.festivolo.core.service.model.Usuario;

public class DatabaseLoader implements CommandLineRunner {

	private final ArtistaRepository repository;

	public DatabaseLoader(ArtistaRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario(1, "usuario_01", "usuario@mail.com", "password", LocalDate.now());
		Direccion direccion = new Direccion("Verin", "Ourense", "España");
		String biografia = "¡La mejor banda del mundo!";
		// Artista artista = new Artista(usuario, "The band", direccion, 15000, null,
		// null, null, biografia, null);
		// this.repository.save(artista);
	}

}

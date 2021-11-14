package com.festivolo.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.festivolo.core.repository.model.Artista;
import com.festivolo.core.service.ArtistaService;

@RestController
public class ArtistaController {

	public static final String VISTA_LISTA = "lista";
	public static final String VISTA_FORMULARIO = "formulario";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ArtistaService artistaService;

	@GetMapping("/artistas")
	public List<Artista> getAll() {
		return artistaService.getAll();
	}

}
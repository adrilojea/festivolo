package com.festivolo.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.festivolo.core.Album;
import com.festivolo.core.Artista;
import com.festivolo.core.GeneroMusical;

@RestController
public class ArtistaController {

	public static final String VISTA_LISTA = "lista";
	public static final String VISTA_FORMULARIO = "formulario";

	@GetMapping("/artistas")
	public List<Artista> getAll() {

		Artista artista = new Artista();
		artista.setNombre("Metallica");
		artista.setGenero(GeneroMusical.METAL);
		List<Album> albunes = new ArrayList<Album>();
		Album blackAlbum = new Album();
		blackAlbum.setTitulo("Black Album");
		albunes.add(blackAlbum);
		Album masterOfPuppets = new Album();
		masterOfPuppets.setTitulo("Master Of Puppets");
		albunes.add(masterOfPuppets);
		artista.setAlbunes(albunes);

		System.out.println(artista.getNombre());
		System.out.println(artista.getGenero());
		for (Album a : artista.getAlbunes())
			System.out.println(a.getTitulo());
		List<Artista> artistas = new ArrayList<Artista>();
		artistas.add(artista);

		return artistas;
	}

	public Artista getById(final int id) {
		return null;

	}
}
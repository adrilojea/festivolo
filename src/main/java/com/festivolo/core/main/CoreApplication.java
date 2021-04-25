package com.festivolo.core.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { MongoAutoConfiguration.class })
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
		System.out.println("Empieza Festivolo:");
		empiezaElConcierto();
	}

	public static void empiezaElConcierto() {
		/*
		 * Artista artista = new Artista(); artista.setNombre("Metallica");
		 * artista.setGenero(GeneroMusical.METAL); List<Album> albunes = new
		 * ArrayList<Album>(); Album blackAlbum = new Album();
		 * blackAlbum.setTitulo("Black Album"); albunes.add(blackAlbum); Album
		 * masterOfPuppets = new Album();
		 * masterOfPuppets.setTitulo("Master Of Puppets"); albunes.add(masterOfPuppets);
		 * artista.setAlbunes(albunes);
		 * 
		 * System.out.println(artista.getNombre());
		 * System.out.println(artista.getGenero()); for (Album a : artista.getAlbunes())
		 * System.out.println(a.getTitulo());
		 */
	}

}

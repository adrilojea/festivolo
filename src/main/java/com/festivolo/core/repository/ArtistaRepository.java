package com.festivolo.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.festivolo.core.repository.model.Artista;

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Long> {

}

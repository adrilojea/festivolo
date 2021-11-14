package com.festivolo.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festivolo.core.repository.ArtistaRepository;
import com.festivolo.core.repository.model.Artista;
import com.festivolo.core.service.ArtistaService;

@Service
public class ArtistaServiceImpl implements ArtistaService {

	@Autowired
	ArtistaRepository artistaRepository;

	@Override
	public List<Artista> getAll() {
		return (List<Artista>) artistaRepository.findAll();

	}

}

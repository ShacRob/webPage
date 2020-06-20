package com.api.services.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.entity.Lenguaje;
import com.api.repository.LenguajesRepository;

public class LenguajesServices {
	
	@Autowired
	private LenguajesRepository repository;

	public List<Lenguaje> findAll() {

		return repository.findAll();
	}

	public void guardar(Lenguaje lenguaje) {
		repository.save(lenguaje);
	}

	public void eliminar(int id) {
		repository.deleteById(id);
	}
}

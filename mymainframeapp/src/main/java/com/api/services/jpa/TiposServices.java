package com.api.services.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.entity.Tipo;
import com.api.repository.TiposRepository;

public class TiposServices {

	@Autowired
	private TiposRepository repository;

	public List<Tipo> findAll() {

		return repository.findAll();
	}

	public void guardar(Tipo tipo) {
		repository.save(tipo);
	}

	public void eliminar(int id) {
		repository.deleteById(id);
	}
}

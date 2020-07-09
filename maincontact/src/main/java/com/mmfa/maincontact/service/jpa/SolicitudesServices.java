package com.mmfa.maincontact.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmfa.maincontact.entity.Solicitud;
import com.mmfa.maincontact.repository.SolicitudesRepository;
import com.mmfa.maincontact.service.ISolicitudesServices;

@Service
public class SolicitudesServices implements ISolicitudesServices {

	@Autowired
	private SolicitudesRepository repository;

	@Override
	public List<Solicitud> buscarTodo() {
		return repository.findAll();
	}

	@Override
	public Solicitud guardar(Solicitud obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminar(int id) {
		repository.deleteById(id);
	}

	@Override
	public Solicitud buscar(int id) {
		Optional<Solicitud> opt = repository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}

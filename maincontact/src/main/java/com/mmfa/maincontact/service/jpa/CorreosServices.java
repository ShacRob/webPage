package com.mmfa.maincontact.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmfa.maincontact.entity.Correo;
import com.mmfa.maincontact.repository.CorreosRepository;
import com.mmfa.maincontact.service.ICorreosServices;

@Service
public class CorreosServices implements ICorreosServices {
	
	@Autowired
	private CorreosRepository repository;

	@Override
	public List<Correo> buscarTodo() {
		return repository.findAll();
	}

	@Override
	public Correo guardar(Correo obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminar(int id) {
		repository.deleteById(id);
	}

	@Override
	public Correo buscar(int id) {
		Optional<Correo> opt = repository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}

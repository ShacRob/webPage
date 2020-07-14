package com.mmfa.maincontact.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmfa.maincontact.entity.Direccion;
import com.mmfa.maincontact.repository.DireccionesRepository;
import com.mmfa.maincontact.service.IDireccionesServices;

@Service
public class DireccionesServices implements IDireccionesServices{

	@Autowired DireccionesRepository repo;
	
	
	@Override
	public List<Direccion> buscarTodo() {
		return repo.findAll();
	}

	@Override
	public Direccion guardar(Direccion obj) {
		return repo.save(obj);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public Direccion buscar(int id) {
		Optional<Direccion> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}

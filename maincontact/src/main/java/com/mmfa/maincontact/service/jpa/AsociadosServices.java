package com.mmfa.maincontact.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmfa.maincontact.entity.Asociado;
import com.mmfa.maincontact.repository.AsociadosRepository;
import com.mmfa.maincontact.service.IAsociadosServices;

@Service
public class AsociadosServices implements IAsociadosServices{

	@Autowired private AsociadosRepository repo;
	
	@Override
	public List<Asociado> buscarTodo() {
		return repo.findAll();
	}

	@Override
	public Asociado guardar(Asociado obj) {
		return repo.save(obj);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

	@Override
	public Asociado buscar(int id) {
		Optional<Asociado> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}

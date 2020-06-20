package com.api.services.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Comentario;
import com.api.repository.ComentariosRepository;
import com.api.services.IComentariosServices;

@Service
public class ComentariosServices implements IComentariosServices {

	@Autowired
	private ComentariosRepository repository;
	
	
	public List<Comentario> findAll() {
		
		return repository.findAll();
	}


	public void guardar(Comentario comentario) {
		repository.save(comentario);		
	}


	public void eliminar(int id) {
		repository.deleteById(id);
	}

}
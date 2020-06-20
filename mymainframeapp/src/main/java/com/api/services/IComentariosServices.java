package com.api.services;

import java.util.List;

import com.api.entity.Comentario;

public interface IComentariosServices {

	List<Comentario> findAll();
	void guardar(Comentario comentario);
	void eliminar(int i);
}

package com.mmfa.maincontact.service;

import java.util.List;

import com.mmfa.maincontact.entity.Direccion;

public interface IDireccionesServices {

	List<Direccion> buscarTodo();
	Direccion guardar(Direccion obj);
	void eliminar(int id);
	Direccion buscar(int id);
}

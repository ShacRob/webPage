package com.mmfa.maincontact.service;

import java.util.List;

import com.mmfa.maincontact.entity.Correo;

public interface ICorreosServices {

	List<Correo> buscarTodo();
	Correo guardar(Correo obj);
	void eliminar(int id);
	Correo buscar(int id);
}

package com.mmfa.maincontact.service;

import java.util.List;

import com.mmfa.maincontact.entity.Telefono;

public interface ITelefonosServices {

	List<Telefono> buscarTodo();
	Telefono guardar(Telefono obj);
	void eliminar(int id);
	Telefono buscar(int id);
}

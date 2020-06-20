package com.api.services;

import java.util.List;

import com.api.entity.Tipo;

public interface ITiposServices {

	List<Tipo> findAll();
	void guardar(Tipo tipo);
	void eliminar(int i);
}

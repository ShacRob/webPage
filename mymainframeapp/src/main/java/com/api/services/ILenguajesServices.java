package com.api.services;

import java.util.List;

import com.api.entity.Lenguaje;

public interface ILenguajesServices {

	List<Lenguaje> findAll();
	void guardar(Lenguaje lenguaje);
	void eliminar(int i);
}

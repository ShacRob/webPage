package com.mmfa.maincontact.service;

import java.util.List;


import com.mmfa.maincontact.entity.Solicitud;

public interface ISolicitudesServices {

	List<Solicitud> buscarTodo();
	Solicitud guardar(Solicitud obj);
	void eliminar(int id);
	Solicitud buscar(int id);
}

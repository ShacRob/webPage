package com.mmfa.maincontact.service;
import java.util.List;

import com.mmfa.maincontact.entity.Asociado;

public interface IAsociadosServices {

	List<Asociado> buscarTodo();
	Asociado guardar(Asociado obj);
	void eliminar(int id);
	Asociado buscar(int id);
}

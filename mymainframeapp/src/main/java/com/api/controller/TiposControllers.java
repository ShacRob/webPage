package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.entity.Tipo;
import com.api.services.ITiposServices;

public class TiposControllers {

@Autowired private ITiposServices service;
	
	@GetMapping("/allTipos")
	public List<Tipo> todas(){
		return service.findAll();
	}
	
	@PostMapping("/Tipo")
	public String guardar(@RequestBody Tipo tipo) {
		service.guardar(tipo);
		return "Save";
	}
	
	@PutMapping("/Tipo")
	public String actualizar(@RequestBody Tipo tipo) {
		service.guardar(tipo);
		return "Update";
	}
	
	@DeleteMapping("/Tipo/{id}")
	public String borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return "Eliminado";
	}
}

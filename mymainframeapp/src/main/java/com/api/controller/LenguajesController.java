package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.entity.Lenguaje;
import com.api.services.ILenguajesServices;

public class LenguajesController {

	@Autowired
	private ILenguajesServices service;

	@GetMapping("/allLenguajes")
	public List<Lenguaje> todas() {
		return service.findAll();
	}

	@PostMapping("/Lenguaje")
	public String guardar(@RequestBody Lenguaje lenguaje) {
		service.guardar(lenguaje);
		return "Save";
	}

	@PutMapping("/Lenguaje")
	public String actualizar(@RequestBody Lenguaje lenguaje) {
		service.guardar(lenguaje);
		return "Update";
	}

	@DeleteMapping("/Lenguaje/{id}")
	public String borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return "Eliminado";
	}
}

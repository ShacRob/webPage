package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Comentario;
import com.api.services.IComentariosServices;

@RestController
@RequestMapping("/apiComentario")
public class ComentariosController {
	
	@Autowired private IComentariosServices service;
	
	@GetMapping("/allComentarios")
	public List<Comentario> todas(){
		return service.findAll();
	}
	
	@PostMapping("/Comentario")
	public String guardar(@RequestBody Comentario comentario) {
		service.guardar(comentario);
		return "Save";
	}
	
	@PutMapping("/Comentario")
	public String actualizar(@RequestBody Comentario comentario) {
		service.guardar(comentario);
		return "Update";
	}
	
	@DeleteMapping("/Comentario/{id}")
	public String borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return "Eliminado";
	}
}
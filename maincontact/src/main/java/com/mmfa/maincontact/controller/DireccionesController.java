package com.mmfa.maincontact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmfa.maincontact.entity.Direccion;
import com.mmfa.maincontact.service.IDireccionesServices;

@RestController
@RequestMapping("/")
public class DireccionesController {

	@Autowired private IDireccionesServices service;
	
	@GetMapping("/allDirecciones")
	public ResponseEntity<List<Direccion>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodo());
	}
	
	@GetMapping("/Direccion/{id}")
	public ResponseEntity<Direccion> obtenerDireccion(@PathVariable("id") int id){
		Direccion Direccion = service.buscar(id);
		if (Direccion == null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(Direccion);
	}
	
	@PostMapping("/Direccion")
	public ResponseEntity<Direccion> guardar(@RequestBody Direccion Direccion) {
		service.guardar(Direccion);
		return ResponseEntity.ok(Direccion);
	}
	
	@PutMapping("/Direccion")
	public ResponseEntity<Direccion> actualizar(@RequestBody Direccion Direccion) {
		service.guardar(Direccion);
		return ResponseEntity.ok(Direccion);
	}
	
	@DeleteMapping("/Direccion/{id}")
	public ResponseEntity<String> borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return ResponseEntity.ok("Eliminado : "+id);
	}
	
}

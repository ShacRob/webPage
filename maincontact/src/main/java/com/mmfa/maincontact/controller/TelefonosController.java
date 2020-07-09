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

import com.mmfa.maincontact.entity.Telefono;
import com.mmfa.maincontact.service.ITelefonosServices;

@RestController
@RequestMapping("/")
public class TelefonosController {

	@Autowired private ITelefonosServices service;
	
	@GetMapping("/allTelefonos")
	public ResponseEntity<List<Telefono>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodo());
	}
	
	@GetMapping("/Telefono/{id}")
	public ResponseEntity<Telefono> obtenerTelefono(@PathVariable("id") int id){
		Telefono telefono = service.buscar(id);
		if (telefono == null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(telefono);
	}
	
	@PostMapping("/Telefono")
	public ResponseEntity<Telefono> guardar(@RequestBody Telefono telefono) {
		service.guardar(telefono);
		return ResponseEntity.ok(telefono);
	}
	
	@PutMapping("/Telefono")
	public ResponseEntity<Telefono> actualizar(@RequestBody Telefono telefono) {
		service.guardar(telefono);
		return ResponseEntity.ok(telefono);
	}
	
	@DeleteMapping("/Telefono/{id}")
	public ResponseEntity<String> borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return ResponseEntity.ok("Eliminado : "+id);
	}
}

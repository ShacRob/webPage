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

import com.mmfa.maincontact.entity.Correo;
import com.mmfa.maincontact.service.ICorreosServices;

@RestController
@RequestMapping("/")
public class CorreosController {

	@Autowired private ICorreosServices service;
	
	@GetMapping("/allCorreos")
	public ResponseEntity<List<Correo>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodo());
	}
	
	@GetMapping("/Correo/{id}")
	public ResponseEntity<Correo> obtenerCorreo(@PathVariable("id") int id){
		Correo correo = service.buscar(id);
		if (correo == null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(correo);
	}
	
	@PostMapping("/Correo")
	public ResponseEntity<Correo> guardar(@RequestBody Correo correo) {
		service.guardar(correo);
		return ResponseEntity.ok(correo);
	}
	
	@PutMapping("/Correo")
	public ResponseEntity<Correo> actualizar(@RequestBody Correo correo) {
		service.guardar(correo);
		return ResponseEntity.ok(correo);
	}
	
	@DeleteMapping("/Correo/{id}")
	public ResponseEntity<String> borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return ResponseEntity.ok("Eliminado : "+id);
	}
}

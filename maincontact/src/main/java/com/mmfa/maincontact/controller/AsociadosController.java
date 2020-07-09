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

import com.mmfa.maincontact.entity.Asociado;
import com.mmfa.maincontact.service.IAsociadosServices;

@RestController
@RequestMapping("/")
public class AsociadosController {

	@Autowired private IAsociadosServices service;
	
	@GetMapping("/allAsociados")
	public ResponseEntity<List<Asociado>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodo());
	}
	
	@GetMapping("/Asociado/{id}")
	public ResponseEntity<Asociado> obtenerAsociado(@PathVariable("id") int id){
		Asociado asociado = service.buscar(id);
		if (asociado == null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(asociado);
	}
	
	@PostMapping("/Asociado")
	public ResponseEntity<Asociado> guardar(@RequestBody Asociado asociado) {
		service.guardar(asociado);
		return ResponseEntity.ok(asociado);
	}
	
	@PutMapping("/Asociado")
	public ResponseEntity<Asociado> actualizar(@RequestBody Asociado asociado) {
		service.guardar(asociado);
		return ResponseEntity.ok(asociado);
	}
	
	@DeleteMapping("/Asociado/{id}")
	public ResponseEntity<String> borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return ResponseEntity.ok("Eliminado : "+id);
	}
}

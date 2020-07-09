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

import com.mmfa.maincontact.entity.Solicitud;
import com.mmfa.maincontact.service.ISolicitudesServices;

@RestController
@RequestMapping("/")
public class SolicitudesController {

	@Autowired private ISolicitudesServices service;
	
	@GetMapping("/allSolicitudes")
	public ResponseEntity<List<Solicitud>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodo());
	}
	
	@GetMapping("/Solicitud/{id}")
	public ResponseEntity<Solicitud> obtenerSolicitud(@PathVariable("id") int id){
		Solicitud solicitud = service.buscar(id);
		if (solicitud == null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(solicitud);
	}
	
	@PostMapping("/Solicitud")
	public ResponseEntity<Solicitud> guardar(@RequestBody Solicitud solicitud) {
		service.guardar(solicitud);
		return ResponseEntity.ok(solicitud);
	}
	
	@PutMapping("/Solicitud")
	public ResponseEntity<Solicitud> actualizar(@RequestBody Solicitud solicitud) {
		service.guardar(solicitud);
		return ResponseEntity.ok(solicitud);
	}
	
	@DeleteMapping("/Solicitud/{id}")
	public ResponseEntity<String> borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return ResponseEntity.ok("Eliminado : "+id);
	}
}

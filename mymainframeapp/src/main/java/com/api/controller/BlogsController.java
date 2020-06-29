package com.api.controller;

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

import com.api.entity.Blog;
import com.api.services.IBlogsServices;

@RestController
@RequestMapping("/apiBlog")
public class BlogsController {
	
	@Autowired private IBlogsServices service;
	
	@GetMapping("/allBlogs")
	public ResponseEntity<List<Blog>> todas(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/Blog/{id}")
	public ResponseEntity<Blog> obtenerBlog(@PathVariable("id") int id){
		Blog blog = service.getBlog(id);
		if (blog == null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(blog);
	}
	
	@PostMapping("/Blog")
	public String guardar(@RequestBody Blog blog) {
		service.guardar(blog);
		return "Save";
	}
	
	@PutMapping("/Blog")
	public String actualizar(@RequestBody Blog blog) {
		service.guardar(blog);
		return "Update";
	}
	
	@DeleteMapping("/Blog/{id}")
	public String borrar(@PathVariable("id") int id) {
		service.eliminar(id);
		return "Eliminado";
	}
}

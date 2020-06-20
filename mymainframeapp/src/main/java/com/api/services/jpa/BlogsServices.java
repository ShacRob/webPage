package com.api.services.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Blog;
import com.api.repository.BlogsRepository;
import com.api.services.IBlogsServices;

@Service
public class BlogsServices implements IBlogsServices {

	@Autowired
	private BlogsRepository repository;
	
	
	public List<Blog> findAll() {
		
		return repository.findAll();
	}


	public void guardar(Blog blog) {
		repository.save(blog);		
	}


	public void eliminar(int id) {
		repository.deleteById(id);
	}

}

package com.api.services;

import java.util.List;

import com.api.entity.Blog;

public interface IBlogsServices {

	List<Blog> findAll();
	void guardar(Blog blog);
	void eliminar(int i);
}

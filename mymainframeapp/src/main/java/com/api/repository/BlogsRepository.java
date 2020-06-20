package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Blog;


public interface BlogsRepository extends JpaRepository<Blog, Integer>{

}

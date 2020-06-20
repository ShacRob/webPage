package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Integer>{

}

package com.mmfa.maincontact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmfa.maincontact.entity.Solicitud;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}

package com.juliana.helpDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliana.helpDesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}

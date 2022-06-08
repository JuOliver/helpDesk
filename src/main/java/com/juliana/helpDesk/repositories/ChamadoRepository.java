package com.juliana.helpDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliana.helpDesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}

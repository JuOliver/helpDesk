package com.juliana.helpDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliana.helpDesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}

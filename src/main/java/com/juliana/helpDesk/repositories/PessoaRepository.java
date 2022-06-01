package com.juliana.helpDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliana.helpDesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}

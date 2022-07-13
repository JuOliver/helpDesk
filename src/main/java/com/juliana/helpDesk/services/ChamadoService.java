package com.juliana.helpDesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliana.helpDesk.domain.Chamado;
import com.juliana.helpDesk.repositories.ChamadoRepository;
import com.juliana.helpDesk.services.exceptions.ObjectnotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;

	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado!" + id));
	}

	public List<Chamado> findAll() {
		return repository.findAll();
	}
}

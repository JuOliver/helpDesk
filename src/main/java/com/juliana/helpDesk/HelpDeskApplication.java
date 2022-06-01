package com.juliana.helpDesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juliana.helpDesk.domain.Chamado;
import com.juliana.helpDesk.domain.Cliente;
import com.juliana.helpDesk.domain.Tecnico;
import com.juliana.helpDesk.domain.enums.Perfil;
import com.juliana.helpDesk.domain.enums.Prioridade;
import com.juliana.helpDesk.domain.enums.Status;
import com.juliana.helpDesk.repositories.ChamadoRepository;
import com.juliana.helpDesk.repositories.ClienteRepository;
import com.juliana.helpDesk.repositories.TecnicoRepository;


@SpringBootApplication
public class HelpDeskApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Juliana", "92770081055", "ju@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "linus torvalds", "79688951030", "linus@mail.com", "123");
		
		Chamado c1= new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}

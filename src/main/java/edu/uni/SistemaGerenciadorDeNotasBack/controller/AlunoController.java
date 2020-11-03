package edu.uni.SistemaGerenciadorDeNotasBack.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.uni.SistemaGerenciadorDeNotasBack.model.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.repository.AlunoRepository;

@RestController
public class AlunoController {
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping(path = "api/aluno/{}")
	public ResponseEntity<Optional<Aluno>> buscarAlunoPorId(@PathVariable(name = "id", required = true) Integer id ) {
		return ResponseEntity.ok(alunoRepository.findById(id));
	}
}

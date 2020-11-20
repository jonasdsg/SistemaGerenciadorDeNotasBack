package edu.uni.SistemaGerenciadorDeNotasBack.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import edu.uni.SistemaGerenciadorDeNotasBack.models.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.modelsDTO.AlunoDTO;
import edu.uni.SistemaGerenciadorDeNotasBack.repository.AlunoRepository;

@CrossOrigin
@RestController
@RequestMapping("alunos")
public class AlunoController {
	
	private AlunoRepository alunoRepository = new AlunoRepository();

	@GetMapping
	public List<AlunoDTO> listarAlunos(){
		List<AlunoDTO> alunos = new ArrayList<AlunoDTO>();
		for(Aluno aluno: alunoRepository.findAll()) {
			alunos.add(aluno.convert());
		}
		return alunos;
	}
	
	@PostMapping
	public ResponseEntity<AlunoDTO> cadastrarAlunos(@RequestBody AlunoDTO alunoDTO, UriComponentsBuilder uriBuilder) {
		Aluno aluno = alunoDTO.converter();
		alunoRepository.save(aluno);
		return ResponseEntity.created(uriBuilder.path("/topicos/{id}").buildAndExpand(aluno.getId()).toUri()).body(alunoDTO);
	}
	
	@DeleteMapping("/{matricula}")
	public ResponseEntity<?> deletarAluno(@PathVariable String matricula){
		alunoRepository.deleteByMatricula(matricula);
		return ResponseEntity.ok().build();
	}

}

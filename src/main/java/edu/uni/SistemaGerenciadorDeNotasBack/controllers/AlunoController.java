package edu.uni.SistemaGerenciadorDeNotasBack.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uni.SistemaGerenciadorDeNotasBack.models.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.models.Avaliacao;
import edu.uni.SistemaGerenciadorDeNotasBack.repository.AlunoRepository;

@RestController
public class AlunoController {
	@Autowired
	private AlunoRepository alunoRepository;
	@CrossOrigin
	@GetMapping(value = "/alunos", produces = "application/json")
	public List<Aluno> alunos(){
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno("Jonas","2017103223");
		Aluno aluno2 = new Aluno("Maria","2018130293");
		Aluno aluno3 = new Aluno("João","20146833423");
		
		aluno1.setAvaliacao(new Avaliacao(2.0,3.0,6.0,6.0,8.0));
		aluno2.setAvaliacao(new Avaliacao(2.5,3.0,6.0,6.0,9.0));
		aluno3.setAvaliacao(new Avaliacao(2.0,3.0,8.0,7.0,8.0));

		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
	
		return alunos;
	}

}

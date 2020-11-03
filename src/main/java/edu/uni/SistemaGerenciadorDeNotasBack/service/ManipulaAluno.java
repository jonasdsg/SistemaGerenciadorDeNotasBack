package edu.uni.SistemaGerenciadorDeNotasBack.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.uni.SistemaGerenciadorDeNotasBack.model.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.repository.AlunoRepository;

public class ManipulaAluno {
	@Autowired
	private AlunoRepository alunoRepository;
	public void cadastrar(Aluno aluno) {
		alunoRepository.saveAndFlush(aluno);
	}
}

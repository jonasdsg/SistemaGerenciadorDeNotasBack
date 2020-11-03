package service;

import org.springframework.beans.factory.annotation.Autowired;

import repository.AlunoRepository;

public class ManipulaAluno {
	@Autowired
	private AlunoRepository alunoRepository;
}

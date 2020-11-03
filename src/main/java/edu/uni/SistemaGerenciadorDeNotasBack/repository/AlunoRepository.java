package edu.uni.SistemaGerenciadorDeNotasBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uni.SistemaGerenciadorDeNotasBack.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

	Aluno saveAndFlush(Aluno aluno);

}

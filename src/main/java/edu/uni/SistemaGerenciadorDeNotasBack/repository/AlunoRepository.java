package edu.uni.SistemaGerenciadorDeNotasBack.repository;

import java.util.ArrayList;
import java.util.List;

import edu.uni.SistemaGerenciadorDeNotasBack.models.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.models.Avaliacao;
//Mock para testes
public  class AlunoRepository {
	private  List<Aluno> alunos = new ArrayList<Aluno>();

	private  void push() {
		Aluno aluno1 = new Aluno("Jonas Góes","2017103223");
		Aluno aluno2 = new Aluno("Maria Joaquina","2018130293");
		Aluno aluno3 = new Aluno("João Carlos","20146833423");
		Aluno aluno4 = new Aluno("Cirilo Tchubiraum","20146833423");
		
		aluno1.setAvaliacao(new Avaliacao(2.0,3.0,6.0,6.0,8.0));
		aluno2.setAvaliacao(new Avaliacao(0.0,3.0,7.0,4.0,5.0));
		aluno3.setAvaliacao(new Avaliacao(2.0,3.0,8.0,7.0,8.0));
		aluno4.setAvaliacao(new Avaliacao(0.0,0.2,6.5,6.0,5.0));

		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);

	}
	
	public  void saveAll(List<Aluno> aluno) {
		alunos.addAll(aluno);
	}
	
	public  void save(Aluno aluno) {
		if(alunos.size()==0) {
			push();
		}
		alunos.add(aluno);
	}
	
	public  List<Aluno> findAll() {
		if(alunos.size()==0) {
			push();
		}
		return alunos;
	}
	
	public  Aluno findByMatricula(String matricula) {
		return (Aluno) alunos.stream().filter(aluno->matricula.equals(aluno.getMatricula()));
	}

	public void deleteByMatricula(String matricula) {
		int i = 0;
		for(Aluno aluno: alunos) {
			if(aluno.getMatricula().equals(matricula))
				break;
			i++;
		}
		alunos.remove(i);
		
	}
}

package edu.uni.SistemaGerenciadorDeNotasBack.repository;

import java.util.ArrayList;

import java.util.List;

import edu.uni.SistemaGerenciadorDeNotas.client.SgnManagerWs;
import edu.uni.SistemaGerenciadorDeNotas.client.SgnManagerWsService;
import edu.uni.SistemaGerenciadorDeNotasBack.models.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.models.Avaliacao;
//Mock para testes
public  class AlunoRepository {
	private  List<Aluno> alunos = new ArrayList<Aluno>();
	SgnManagerWs sgnService = new SgnManagerWsService().getSgnManagerWsPort();
	
	public  void saveAll(List<Aluno> aluno) {
		alunos.addAll(aluno);
	}
	
	public  void save(Aluno aluno) {
		edu.uni.SistemaGerenciadorDeNotas.client.Avaliacao avaliacao = new edu.uni.SistemaGerenciadorDeNotas.client.Avaliacao(aluno.getAvaliacao().getAps1(),aluno.getAvaliacao().getAps2(),aluno.getAvaliacao().getAv1(),aluno.getAvaliacao().getAv2(),aluno.getAvaliacao().getAv3());

		String nome = aluno.getNome();
		String matricula = aluno.getMatricula();
		
		edu.uni.SistemaGerenciadorDeNotas.client.Aluno alunows = new edu.uni.SistemaGerenciadorDeNotas.client.Aluno(nome,matricula,avaliacao);

		sgnService.cadastrarAluno(alunows);
	}
	
	public  List<Aluno> findAll() {
		alunos = null;
		alunos = new ArrayList<Aluno>();
		if(alunos.size()==0) {
			List<edu.uni.SistemaGerenciadorDeNotas.client.Aluno> alunosXml = sgnService.obterTodosOsAlunos();
			for(edu.uni.SistemaGerenciadorDeNotas.client.Aluno aluno:alunosXml) {
				Avaliacao avaliacao = new Avaliacao(aluno.getAvaliacao().getAps1(),aluno.getAvaliacao().getAps2(),aluno.getAvaliacao().getAv1(),aluno.getAvaliacao().getAv2(),aluno.getAvaliacao().getAv3());
				alunos.add(new Aluno(aluno.getNome(),aluno.getMatricula(),avaliacao));
			}
			
		}
		
		return alunos;
	}
	
	public  Aluno findByMatricula(String matricula) {
		return (Aluno) alunos.stream().filter(aluno->matricula.equals(aluno.getMatricula()));
	}

	public void deleteByMatricula(String matricula) {
		sgnService.removerAluno(matricula);		
	}
}

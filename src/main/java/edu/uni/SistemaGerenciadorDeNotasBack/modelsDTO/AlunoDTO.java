package edu.uni.SistemaGerenciadorDeNotasBack.modelsDTO;

import edu.uni.SistemaGerenciadorDeNotasBack.models.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.models.Avaliacao;

public class AlunoDTO {
	
	private String nome;
	private String matricula;
	private Avaliacao avaliacao;
	
	public AlunoDTO() {}
	
	public AlunoDTO(String nome, String matricula, Avaliacao avaliacao) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.avaliacao = avaliacao;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public Aluno converter() {
		Aluno aluno = new Aluno(this.nome,this.matricula);
		aluno.setAvaliacao(this.avaliacao);
		return aluno;
	}
}

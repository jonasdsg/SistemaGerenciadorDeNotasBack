package edu.uni.SistemaGerenciadorDeNotasBack.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.uni.SistemaGerenciadorDeNotasBack.modelsDTO.AlunoDTO;

@Entity
public class Aluno  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String matricula;
	@OneToOne
	private Avaliacao avaliacao;
	
	public Aluno(){}
	
	public Aluno(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public Integer getId() {
		return id;
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
	
	public AlunoDTO convert() {
		return new AlunoDTO(this.nome,this.matricula,this.avaliacao);
	}
	
	
}

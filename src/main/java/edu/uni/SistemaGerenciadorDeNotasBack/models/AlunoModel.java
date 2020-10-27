package edu.uni.SistemaGerenciadorDeNotasBack.models;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class AlunoModel extends PessoaModel implements AvaliacaoModel {
	private static final long serialVersionUID = 1L;
	private double aps1, av1, aps2, av2, av3;
	
	public AlunoModel(double aps1, double av1, double aps2, double av2, double av3) {
		super();
		this.aps1 = aps1;
		this.av1 = av1;
		this.aps2 = aps2;
		this.av2 = av2;
		this.av3 = av3;
	}
	
	
	@Override
	public Double av1() {
		 return aps1+av1;
	}
	@Override
	public Double av2() {
		 return aps2+av2;
	}
	@Override
	public Double av3() {
		 return av3;
	}
	@Override
	public Double media() {
		 Double[] lista = { this.av1()+this.av2(),
				 			this.av1()+this.av3(),
				 			this.av2()+this.av3() };
		 return maior(lista); //método default
	}

}

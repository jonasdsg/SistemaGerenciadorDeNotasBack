package edu.uni.SistemaGerenciadorDeNotasBack.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avaliacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Double av1;
	private Double av2;
	private Double av3;
	private Double aps1;
	private Double aps2;
	
	public Avaliacao() {}
	
	public Double getAv1() {
		return av1+aps1;
	}

	public Double getAv2() {
		return av2+aps2;
	}
	
	public Double getAv3() {
		return av3;
	}

	public Double getMedia() {
		
		if(getAv1()>getAv3() && getAv2()>getAv3())
			return (getAv1()+getAv2())/2;
		
		if(getAv1()>getAv2() && getAv3()>getAv2())
			return (getAv1()+getAv3())/2;
		
		return (getAv2()+getAv3())/2;
	} 
	
	
}

package edu.uni.SistemaGerenciadorDeNotasBack.models;

public interface AvaliacaoModel {
	 public double  aps1 = 0, av1 = 0,
			 		aps2 = 0, av2 = 0,
			 		av3 = 0;
	 
	 default public Double av1() {
		 return aps1+av1;
	 }
	 
	 default public Double av2() {
		 return aps2+av2;
	 }
	 
	 default public Double av3() {
		 return av3;
	 }
	 
	 default public Double media() {
		 Double[] lista = { this.av1()+this.av2(),
				 			this.av1()+this.av3(),
				 			this.av2()+this.av3() };
		 return maior(lista);
	 }
	 
	 default public Double maior(Double[] medias) { 
		 Double maior = 0.0;
		 for(Double mediaAtual: medias) {
			 if(mediaAtual>maior)
				 maior = mediaAtual;
		 }
		 return maior;
	 }
	 
}

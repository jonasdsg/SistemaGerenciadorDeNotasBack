package edu.uni.SistemaGerenciadorDeNotasBack.models;

public interface AvaliacaoModel {
	 	 
	 public Double av1();
	 
	 public Double av2();
	 
	 public Double av3();
	 
	 public Double media();
	 
	 default public Double maior(Double[] medias) { 
		 Double maior = 0.0;
		 for(Double mediaAtual: medias) {
			 if(mediaAtual>maior)
				 maior = mediaAtual;
		 }
		 return maior;
	 }
	 
}

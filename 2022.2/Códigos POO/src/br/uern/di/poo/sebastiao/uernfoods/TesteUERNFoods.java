package br.uern.di.poo.sebastiao.uernfoods;

import java.time.LocalDate;

public class TesteUERNFoods {

	public static void main(String[] args) {
		Alimento alimento1, alimento2;
		alimento1 = new Alimento("1 unidade", "300 calorias", 
				"Fabricação própria", "Coxinha");
		alimento2 = new Alimento("1 unidade", "500 calorias", 
				"Fabricação própria", "Brigadeiro");
		
		Anuncio anuncio1;
		anuncio1 = new Anuncio(alimento1, "Coxinhas mais saborosas da cidade",
				"Sebastião das Coxinhas", 5.00, LocalDate.now(),StatusDoAnuncio.ATIVO);
	}
	
}

package br.uern.di.poo.testeexemplos;

import br.uern.di.poo.exemplos.CartaBaralho;

public class TesteBaralho {

	public static void main(String[] args) {
		
		CartaBaralho [] todoOBaralho = CartaBaralho.geraBaralho();
		
		for(CartaBaralho carta : todoOBaralho)
			System.out.println(carta.toString());

	}

}

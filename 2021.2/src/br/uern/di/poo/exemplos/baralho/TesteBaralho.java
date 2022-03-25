package br.uern.di.poo.exemplos.baralho;

public class TesteBaralho {

	public static void main(String[] args) {
		
		CartaBaralho [] todoOBaralho = CartaBaralho.geraBaralho();
		
		for(CartaBaralho carta : todoOBaralho)
			System.out.println(carta.toString());

	}

}

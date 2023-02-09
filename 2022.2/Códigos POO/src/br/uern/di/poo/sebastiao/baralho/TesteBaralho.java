package br.uern.di.poo.sebastiao.baralho;

public class TesteBaralho {
	
	public static void main(String[] args) {
		Naipe naipe1 = Naipe.ESPADAS;
		Naipe naipe2 = Naipe.COPAS;

		Carta carta1 = Carta.DOIS;
		Carta carta2 = Carta.REI;
		
		CartaBaralho cartaBaralho1 = new CartaBaralho(naipe1, carta1);
		CartaBaralho cartaBaralho2 = new CartaBaralho(naipe2, carta2);
		CartaBaralho cartaBaralho3 = new CartaBaralho(Naipe.PAUS, Carta.AS);
		
		System.out.println("Os pontos das duas cartas somadas: " +
				(carta1.getValor() + carta2.getValor()));
		
		for(Carta c : Carta.values())
			System.out.println(c.getNome());
		
		for(Naipe n : Naipe.values())
			System.out.println(n.getNomeEmIngles());
		
		/*
		if (naipe1 == naipe2)
			System.out.println("Cartas do mesmo naipe");
		else
			System.out.println("Cartas de naipes diferentes");
		
		System.out.println("O símbolo da primeira carta é " +
				naipe1.getSimbolo());

		System.out.println("O símbolo da segunda carta é " +
				naipe2.getSimbolo()); */
	}

}

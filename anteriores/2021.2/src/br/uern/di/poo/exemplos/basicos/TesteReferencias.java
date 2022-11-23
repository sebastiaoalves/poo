package br.uern.di.poo.exemplos.basicos;

import br.uern.di.poo.exemplos.classes.JogoFutebol;

public class TesteReferencias {

	public static void main(String[] args) {
		JogoFutebol jogo1 = new JogoFutebol("Corinthians", 1, "São Paulo", 0);
		
		JogoFutebol jogo2 = new JogoFutebol("Corinthians", 1, "São Paulo", 0);
		
		if (jogo1 == jogo2)
			System.out.println("Objetos iguais");
		else
			System.out.println("Objetos diferentes");
		
		if(jogo1.equals(jogo2))
			System.out.println("Conteúdos iguais");
		
		JogoFutebol jogo3 = jogo2;
		
		jogo3.setGolsTimeCasa(2);
		
		if (jogo3 == jogo2)
			System.out.println("Objetos iguais");
		else
			System.out.println("Objetos diferentes");
		
	}
}

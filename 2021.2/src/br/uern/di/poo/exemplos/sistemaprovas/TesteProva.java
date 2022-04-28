package br.uern.di.poo.exemplos.sistemaprovas;

import java.util.GregorianCalendar;

public class TesteProva {

	public static void main(String[] args) {
		
		Questao questao1 = new Questao("O que é um objeto?", 
				new String[]{"Uma instância de uma classe", "Um tipo abstrato de dados"}, 
				1, 1, Dificuldade.MUITO_FACIL, Assunto.MATEMATICA, Serie.TERCEIRA);
		
		Questao questao2 = new Questao("Quem descobriu o Brasil foi Pedro Álvares", 
				new String[]{"José", "Silva", "Cabral", "Cabrito"}, 
				3, 2, Dificuldade.FACIL, Assunto.CIENCIAS_HUMANAS, Serie.PRIMEIRA);
		
		Prova simulado = new Prova("Simulado 1º trimestre",
				new GregorianCalendar(),
				new Questao[]{questao1, questao2});
		
		System.out.println(simulado);
		
	}
	
}

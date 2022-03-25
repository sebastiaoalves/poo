package br.uern.di.poo.exemplos.basicos;

import java.util.Random;

public class TesteRandom {

	public static void main(String[] args) {
		
		Random gerador = new Random( );

		System.out.println("Gerando 10 números inteiros aleatórios");
		// Gerando 10 números aleatórios entre 0 e 100
		for (int i = 0; i < 10 ; i++)
		    System.out.println (gerador.nextInt(101));

		// Rolando um dado aleatório até sair 6
		System.out.println("Rolando um dado aleatório até sair 6");
		int dado;
		do{
		    dado = 1 + gerador.nextInt(6); // 1 + aleatorio entre 0 e 5
		    System.out.println("Resultado do dado: " +dado);
		}while(dado!=6);

		// Uma nota aleatória entre 0 e 10
		double nota = 10.01 * gerador.nextDouble();
		System.out.println("Nota média da turma: " + nota);

	}
}

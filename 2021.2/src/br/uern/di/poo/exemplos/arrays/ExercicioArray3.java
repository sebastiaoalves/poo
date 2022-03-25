package br.uern.di.poo.exemplos.arrays;
import java.util.Random;

import br.uern.di.poo.exemplos.pagamentos.Conta;

public class ExercicioArray3 {

	// Criar um array de 10 objetos do tipo conta
	// onde o nome do titular deve ser preenchido como “Usuário #i ”, 
	// com i variando de 0 a 9, 
	// e um saldo inicial aleatório de até R$ 1.000,00. 
	// Faça depósitos aleatórios de até R$ 100,00 em cada uma e depois exiba as informações. 

	
	public static void main(String[] args) {
		
		final int NUM_CONTAS = 10;
		Conta banco[] = new Conta[NUM_CONTAS];
		
		Random geradorAleatorio = new Random();
		
		for (int i = 0; i < NUM_CONTAS; i++) {
			String nomeTitular = "Usuario #" + i;
			double saldo = geradorAleatorio.nextDouble() * 1000.0;
			banco[i] = new Conta(nomeTitular, saldo);
		}
		
		for(Conta c : banco)
			System.out.println(c.toString());
		
		System.out.println();
		
		for(Conta c : banco) {
			double valorASerDepositado = geradorAleatorio.nextDouble() * 100.0;
			c.realizaDeposito(valorASerDepositado);
			System.out.println("Realizando depósito de " + valorASerDepositado
					+ " na conta do " + c.getNomeTitular());
		}
		
		System.out.println();
			
		for(Conta c : banco)
			System.out.println(c.toString());

	}

}

package br.uern.di.poo.exercicios.questao0215;

import java.util.Scanner;

public class Questao0215 {
	
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		
		int numero1;
		numero1 = entrada.nextInt();
		
		System.out.println("Digite outro número");
		int numero2 = entrada.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("A soma dos números é " + soma);
		
		int diferenca = numero1 - numero2;
		System.out.println("A diferença dos números é " + diferenca);
		
		int produto = numero1 * numero2;
		System.out.println("O produto dos números é ");
		System.out.println(produto);
		
		System.out.println("O quociente dos números é " + ((double)numero1/numero2) );
		
		entrada.close();
	}

}

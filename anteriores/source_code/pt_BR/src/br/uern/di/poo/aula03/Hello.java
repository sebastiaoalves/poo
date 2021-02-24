package br.uern.di.poo.aula03;

import java.util.Scanner;

/** <p> Arquivo que não faz nada </p>
	<p> Comentário de múltiplas linhas </p>*/
public class Hello{
	
	/** Função principal da classe */
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		String nome;

		nome = entrada.next();
		
		System.out.println("Seu nome é " + nome);
	}
	
}

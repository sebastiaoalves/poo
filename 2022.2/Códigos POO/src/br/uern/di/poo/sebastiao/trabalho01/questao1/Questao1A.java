/* 14.17 (Criando Strings com três letras a partir de uma palavra com cinco letras) 
 * Elabore um aplicativo que lê uma palavra com cinco letras fornecida pelo usuário e 
 * produz cada string possível com três letras que podem ser derivadas das letras dessa palavra
 */

// Essa é apenas um modelo de solução

package br.uern.di.poo.sebastiao.trabalho01.questao1;

import java.util.Scanner;

public class Questao1A {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String palavraComCincoLetras;
		
		System.out.print("Digite uma palavra com 5 letras: ");
		palavraComCincoLetras = s.next();
		if(palavraComCincoLetras.length() != 5) {
			System.err.println("Erro: a palavra deve conter exatamente 5 letras!");
			System.exit(0);
		}
		System.out.println("Lista de todas as palavras possíveis com 3 letras:");
		
		// A estratégia consiste em construir 3 laços, cada um pegando uma letra 
		// de uma posição da palavra. Não vamos tratar se as palavras existem, a
		// ordem das letras ou se elas se repetem.
		StringBuilder palavraComTresLetras = new StringBuilder("   ");
		for(int idxLetra1 = 0; idxLetra1 < 5; idxLetra1++)
			for(int idxLetra2 = 0; idxLetra2 < 5; idxLetra2++)
				for(int idxLetra3 = 0; idxLetra3 < 5; idxLetra3++) {
					char letra1 = palavraComCincoLetras.charAt(idxLetra1);
					char letra2 = palavraComCincoLetras.charAt(idxLetra2);
					char letra3 = palavraComCincoLetras.charAt(idxLetra3);
					palavraComTresLetras.setCharAt(0, letra1);
					palavraComTresLetras.setCharAt(1, letra2);
					palavraComTresLetras.setCharAt(2, letra3);
					System.out.println(palavraComTresLetras);
				}
		
		s.close();
	}
}

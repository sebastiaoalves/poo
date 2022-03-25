package br.uern.di.poo.exemplos;
import java.util.Scanner;

public class ExercicioArray2 {
	
	// Criar um vetor de 7 Strings
	// que devem ser lidas através da entrada padrão (System.in).
	// Logo após, concatená-las em uma StringBuilder da última para a primeira


	public static void main(String[] args) {
		
		final int NUM_STRINGS = 7;
		String vetorString [] = new String[NUM_STRINGS];

		Scanner entrada = new Scanner (System.in);
		for (int i = 0; i < vetorString.length; i++) {
			System.out.print("Digite a string #" + (i+1) + ": ");
			vetorString[i] = entrada.next();
		}

		StringBuilder stringCompleta = new StringBuilder();
		
		for (int i = vetorString.length - 1; i >=0; i--)
			stringCompleta.append(vetorString[i]);
		
		System.out.println("Concatenação na ordem inversa: " 
				+ stringCompleta.toString());
		
	}

}

package br.uern.di.poo.exemplos.arrays;

import java.util.Arrays;

import br.uern.di.poo.exemplos.classes.JogoFutebol;

public class TesteArray2 {

	public static void main(String[] args) {
		double notas[];
		notas = new double[4];
		
		final int NUMERO_JOGOS_CAMPEONATO = 20;
		JogoFutebol campeonato[];
		campeonato = new JogoFutebol[NUMERO_JOGOS_CAMPEONATO];
		
		System.out.println("Valores iniciais das notas: ");

		for (double nota: notas)
			System.out.println(nota);
		
		for(int i = 0; i < campeonato.length; i++)
			System.out.println(campeonato[i]);
		
		String nomes[] = {"Sebastião", "Alves", "POO"};
		System.out.println("Tamanho do vetor nomes: " + nomes.length);
		
		for (String n : nomes) {
			System.out.println(n);
			n="Emidio";
		}
		
		for (int i=0; i<nomes.length; i++) {
			String n = nomes[i];
			System.out.println(n);
		}
		
		int matriz [][];
		matriz = new int [3][2];
		matriz [0][0]=0;
		
		String nomesAlunos [][];
		nomesAlunos = new String[8][]; // 3 linhas
		nomesAlunos [0] = new String [30];
		nomesAlunos [1] = new String [25];
		nomesAlunos [2] = new String [10];
		
		boolean tabelaVerdade [][] = {
				{true, false}, 
				{false, false}, 
				{true, true}};
		for(int i=0; i< tabelaVerdade.length; i++)
			System.out.println(Arrays.toString(tabelaVerdade[i]));
		
		
	}

}

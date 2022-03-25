package br.uern.di.poo.exemplos;

public class ExercicioArray1 {

	public static void main(String[] args) {
		
		double vetor [] = {2.7, 8.4, 9.5, 10, 0, 6.3, 8.8};
		
		System.out.println("Elementos do vetor:");
		for(int i = 0; i < vetor.length; i++ )
			System.out.print(vetor[i] + " ");
		
		double soma = 0;
		for(double n : vetor)
			soma += n;
		
		System.out.println(" -- A soma dos elementos é: " + soma);
		
	}

}

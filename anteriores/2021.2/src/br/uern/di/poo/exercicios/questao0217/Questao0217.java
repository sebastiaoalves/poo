package br.uern.di.poo.exercicios.questao0217;

public class Questao0217 {

	// encapsulamento | modificadores | tipo de retorno | nome | lista de parâmetros
	
	public static int calculaSoma (int numero1, int numero2, int numero3) {
		int soma;
		soma = numero1 + numero2 + numero3;
		return soma;
	}
	
	public static int calculaProduto (int numero1, int numero2, int numero3) {
		int produto;
		produto = numero1 * numero2 * numero3;
		return produto;
	}
	
	public static int calculaMedia (int numero1, int numero2, int numero3) {
		int media;
		media = (numero1 + numero2 + numero3) / 3;
		return media;
	}
	
	public static int maiorNumero (int numero1, int numero2, int numero3) {
		// O número 1 é o maior
		if (numero1 > numero2 && numero1 > numero3)
			return numero1;
		else if(numero2 > numero3) // O número 2 é o maior
			return numero2;
		else // O número 3 é o maior
			return numero3;
	}
	
	public static int menorNumero (int numero1, int numero2, int numero3) {
		// O número 1 é o menor
		if (numero1 < numero2 && numero1 < numero3)
			return numero1;
		else if(numero2 < numero3) // O número 2 é o menor
			return numero2;
		else // O número 3 é o menor
			return numero3;
	}
	
}

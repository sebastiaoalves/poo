package br.uern.di.poo.exercicios.questao0217;

public class TesteQuestao0217 {

	public static void main(String[] args) {
		int a = 10, b = 25, c = 78;
		int s = Questao0217.calculaSoma(a, b, c);
		System.out.println("A soma dos números é: " + s);
		int m = Questao0217.calculaMedia(a, b, c);
		System.out.println("A média dos números é: " + m);
		int p = Questao0217.calculaProduto(a, b, c);
		System.out.println("O produto dos números é: " + p);
		
		System.out.println("O maior número é: " + Questao0217.maiorNumero(a, b, c));
		System.out.println("O menor número é: " + Questao0217.menorNumero(a, b, c));
		
	}
}

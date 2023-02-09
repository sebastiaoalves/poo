package br.uern.di.poo.sebastiao.uernpay;

public class ContaV1 {

	// Atributos da classe
	int numero;
	String nomeDoTitular;
	double saldo;
	
	// Operação da classe
	void exibeConta() {
		System.out.println("Minha conta: ");
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Nome do titular: " + this.nomeDoTitular);
		System.out.printf("Saldo da conta: %.2f\n\n", this.saldo);
	}
		
}

package br.uern.di.poo.sebastiao.uernpay;

public class ContaV2 {

	// Atributos da classe
	int numero;
	String nomeDoTitular;
	double saldo;
	
	// Construtrores
	ContaV2 (){
		numero = -1;
		nomeDoTitular = "Sem titular";
		saldo = 0.0;
	}
	
	ContaV2 (int numero, String nomeDoTitular){
		this.numero = numero;
		this.nomeDoTitular = nomeDoTitular;
		saldo = 0.0;
	}
	
	ContaV2 (int numero, String nomeDoTitular, double saldo){
		this.numero = numero;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}
	
	// Operação da classe
	void exibeConta() {
		System.out.println("Minha conta: ");
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Nome do titular: " + this.nomeDoTitular);
		System.out.printf("Saldo da conta: %.2f\n\n", this.saldo);
	}
		
}

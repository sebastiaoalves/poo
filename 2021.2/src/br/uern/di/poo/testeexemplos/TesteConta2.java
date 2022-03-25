package br.uern.di.poo.testeexemplos;

import br.uern.di.poo.exemplos.Conta;

public class TesteConta2 {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		
		System.out.println("Dados da conta corrente:");
		System.out.println(contaCorrente.nomeTitular);
		System.out.println(contaCorrente.consultaSaldo());
		
		contaCorrente.realizaDeposito(100);
		contaCorrente.realizaDeposito(374.56);
		
		System.out.println("Saldo após o depósito ");
		System.out.println(contaCorrente.consultaSaldo());
		
		Conta contaPoupanca = new Conta("Sebastião");
		System.out.println("Dados da conta poupança:");
		System.out.println(contaPoupanca.nomeTitular);
		System.out.println(contaPoupanca.consultaSaldo());
		
		contaPoupanca.realizaDeposito(200000);
		contaPoupanca.realizaSaque(13452.17);
		System.out.println(contaPoupanca.consultaSaldo());
		
		// Conta contaPagamento = new Conta(1000.0);
		
	}

}

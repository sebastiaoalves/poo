package br.uern.di.poo.sebastiao.uernpay;

import javax.swing.JOptionPane;

import static java.lang.Double.parseDouble;

//import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1, conta2;
		conta1 = new Conta();
		conta2 = new Conta();
		
		String nome = JOptionPane.showInputDialog("Digite o nome do titular da conta");
		String saldoInicialString = JOptionPane.showInputDialog("Digite o saldo inicial da conta");
		
		double saldoInicial = Double.parseDouble(saldoInicialString);
		
		conta1.setNomeDoTitular(nome);
		conta1.setSaldo(saldoInicial);
		conta1.deposita(parseDouble(JOptionPane.showInputDialog("Digite o valor a depositar")));
		conta1.saca(-1000);
		conta1.exibeConta();
		
		conta2.setNomeDoTitular("Mariana");
		conta2.setSaldo(-300.0);
		conta2.deposita(500);
		conta2.saca(200);
		conta2.exibeConta();
		
		Conta conta3 = new Conta();
		conta3.deposita(1000);
		conta3.exibeConta();
		
		Conta conta4 = new Conta("José");
		conta4.exibeConta();
		
		Conta conta5 = new Conta("Antônio", 1000.0);
		conta5.exibeConta();
		conta5.deposita(-5000);
		conta5.saca(280);
		conta5.exibeConta();
		
	}

}

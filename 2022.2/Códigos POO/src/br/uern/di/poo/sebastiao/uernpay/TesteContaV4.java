package br.uern.di.poo.sebastiao.uernpay;

//import java.util.Scanner;

public class TesteContaV4 {

	public static void main(String[] args) {
		Conta conta1, conta2;
		conta1 = new Conta();
		conta2 = new Conta();
		
		conta1.setNomeDoTitular("João");
		conta1.setSaldo(100.0);
		conta1.deposita(200.0);
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

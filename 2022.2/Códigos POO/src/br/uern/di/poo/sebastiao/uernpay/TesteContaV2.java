package br.uern.di.poo.sebastiao.uernpay;

//import java.util.Scanner;

public class TesteContaV2 {

	public static void main(String[] args) {
		ContaV2 conta1, conta2;
		conta1 = new ContaV2();
		conta2 = new ContaV2();
		
		conta1.numero = 1;
		conta1.nomeDoTitular = "João";
		conta1.saldo = 100.0;
		
		conta1.exibeConta();
		
		conta2.numero = 2;
		conta2.nomeDoTitular = "Mariana";
		conta2.saldo = -300.0;
		
		conta2.exibeConta();

		/* 
		System.out.println("Titular da conta 1: " + conta1.nomeDoTitular);
		Scanner entrada = new Scanner(System.in);
		conta2.saldo = entrada.nextDouble();
		System.out.println("Saldo da conta 2: " + conta2.saldo);
		*/
		
		ContaV2 conta3 = new ContaV2();
		conta3.exibeConta();
		
		ContaV2 conta4 = new ContaV2(1, "José");
		conta4.exibeConta();
		
	}

}

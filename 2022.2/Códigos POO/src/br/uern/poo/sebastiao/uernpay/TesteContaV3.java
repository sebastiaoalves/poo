package br.uern.poo.sebastiao.uernpay;

//import java.util.Scanner;

public class TesteContaV3 {

	public static void main(String[] args) {
		ContaV3 conta1, conta2;
		conta1 = new ContaV3();
		conta2 = new ContaV3();
		
		conta1.setNumero(1);
		conta1.setNomeDoTitular("João");
		conta1.setSaldo(100.0);
		
		conta1.exibeConta();
		
		conta2.setNumero(2);
		conta2.setNomeDoTitular("Mariana");
		conta2.setSaldo(-300.0);
		
		conta2.exibeConta();
		
		ContaV3 conta3 = new ContaV3();
		conta3.exibeConta();
		
		ContaV3 conta4 = new ContaV3(1, "José");
		conta4.exibeConta();
		
	}

}

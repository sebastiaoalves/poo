package br.uern.di.poo.exemplos.pagamentos;

public class TesteUERNPay2 {

	public static void main(String[] args) {
		UERNPay2 conta1 = new UERNPay2("Sebastião", 500);
		UERNPay2 conta2 = new UERNPay2("Max", 700);
		
		System.out.println("Número da conta de Sebastião: " + conta1.getNumeroConta());
		
		System.out.println("Número da conta de Max: " + conta2.getNumeroConta());
		
		conta1.realizaSaque(300);
		System.out.println(conta1.getSaldo());
		
		conta2.realizaSaque(695);
		System.out.println(conta2.getSaldo());
	}
	
}

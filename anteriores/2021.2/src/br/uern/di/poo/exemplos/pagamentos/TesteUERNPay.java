package br.uern.di.poo.exemplos.pagamentos;

public class TesteUERNPay {

	public static void main(String[] args) {
		UERNPay conta1 = new UERNPay("Sebastião", 500, TipoCliente.BLACK);
		UERNPay conta2 = new UERNPay("Max", 700, TipoCliente.PLATINUM);
		UERNPay conta3 = new UERNPay("Zezinho", 10, TipoCliente.STANDARD);
						
		conta1.realizaSaque(300);
		System.out.println(conta1.getSaldo());
		conta1.realizaPagamento(100);
		System.out.println(conta1.getSaldo());
		
		
		conta2.realizaDeposito(1000);
		System.out.println(conta2.getSaldo());
		conta2.realizaPagamento(1200);
		System.out.println(conta2.getSaldo());
		

		conta3.realizaDeposito(50);
		System.out.println(conta3.getSaldo());
		conta3.realizaPagamento(30);
		System.out.println(conta3.getSaldo());
		conta3.realizaSaque(30);
		System.out.println(conta3.getSaldo());
		
	}
	
}

package br.uern.di.poo.sebastiao.trabalho01.questao3;

public class Main {

	public static void main(String[] args) {
		Porta porta1 = new Porta();
		porta1.exibePorta();
		System.out.println("Valor: R$ " + porta1.calculaPreco());
		System.out.println("Valor da instalação : R$ " + ServicosPorta.calculaPrecoInstalacao(porta1));
		
		Porta porta2 = new Porta (TipoPorta.PORTA_PADRAO, 1.2, 1.8, false);
		porta2.exibePorta();
		System.out.println("Valor: R$ " + porta2.calculaPreco());
		System.out.println("Valor da instalação : R$ " + ServicosPorta.calculaPrecoInstalacao(porta2));

		
		Porta porta3 = new Porta ();
		porta3.setLargura(1.5);
		porta3.setPivotante(true);
		porta3.exibePorta();
		System.out.println("Valor: R$ " + porta3.calculaPreco());
		System.out.println("Valor da instalação : R$ " + ServicosPorta.calculaPrecoInstalacao(porta3));

		
		Porta porta4 = new Porta (TipoPorta.PORTA_LUXO, 1.5, 2.4, true);
		porta4.exibePorta();
		System.out.println("Valor: R$ " + porta4.calculaPreco());
		System.out.println("Valor da instalação : R$ " + ServicosPorta.calculaPrecoInstalacao(porta4));

		
	}
}

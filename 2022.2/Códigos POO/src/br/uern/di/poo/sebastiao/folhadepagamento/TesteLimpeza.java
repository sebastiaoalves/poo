package br.uern.di.poo.sebastiao.folhadepagamento;

public class TesteLimpeza {

	public static void main(String[] args) {
		Limpeza funcionario2 = new Limpeza("Maria", "maria@maria.com",
				"8488888888", 1302.54);
		System.out.println("O salário de " + funcionario2.getNome() +
				" é de R$ " + funcionario2.getSalario());
		funcionario2.setSalarioFixo(1500);
		System.out.println("O salário de " + funcionario2.getNome() +
				" é de R$ " + funcionario2.getSalario());
	}
	
}

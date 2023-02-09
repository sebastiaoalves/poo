package br.uern.di.poo.sebastiao.folhadepagamento;

public class TesteGerente {
	
	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("José", "jose@jose.com", 
				"000000000", 10000, 0.01);
		Vendedor v2 = new Vendedor("Josefa", "josefa@josefa.com", 
				"000000000", 100000, 0.02);
		System.out.println("Salário de " + v1.getNome() + " R$ " + v1.getSalario());
		System.out.println("Salário de " + v2.getNome() + " R$ " + v2.getSalario());
		Vendedor equipe1[] = {v1, v2};
		Gerente gerente1 = new Gerente("João", "joao@joao.com", 
				"não informado", 2000, 0.05, equipe1);
		System.out.println("Salário de " + gerente1.getNome() + " R$ " + gerente1.getSalario());
	}

}

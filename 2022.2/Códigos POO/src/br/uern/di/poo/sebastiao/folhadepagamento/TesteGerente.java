package br.uern.di.poo.sebastiao.folhadepagamento;

public class TesteGerente {
	
	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("José", "jose@jose.com", 
				"000000000");
		v1.setTotalDeVendas(10000);
		Vendedor v2 = new Vendedor("Josefa", "josefa@josefa.com", 
				"000000000");
		v2.setTotalDeVendas(20000);
		Vendedor equipe1[] = {v1, v2};
		Gerente gerente1 = new Gerente("João", "joao@joao.com", 
				"não informado", equipe1);
		System.out.println("Salário de " + gerente1.getNome() + " R$ " + gerente1.getSalario());
	}

}

package br.uern.di.poo.sebastiao.folhadepagamento;

public class TesteFolhaDePagamento {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("José", "jose@jose.com", 
				"000000000");
		v1.setTotalDeVendas(150000);
		Vendedor v2 = new Vendedor("Josefa", "josefa@josefa.com", 
				"000000000");
		v2.setTotalDeVendas(200000);
		Vendedor equipe1[] = {v1, v2};
		Gerente gerente1 = new Gerente("João", "joao@joao.com", 
				"não informado", equipe1);
		Limpeza limpeza1 = new Limpeza("Maria", "maria@maria.com", "");
		
		Funcionario equipe [] = {limpeza1, v1, v2, gerente1};
		double totalFolhaDePagamento = 0.0;
		for(Funcionario f:equipe)
			totalFolhaDePagamento += f.getSalario();
		System.out.println("O total da folha de pagamento é R$" + totalFolhaDePagamento);
		
	}

}

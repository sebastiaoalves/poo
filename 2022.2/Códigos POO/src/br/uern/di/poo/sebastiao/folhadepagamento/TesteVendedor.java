package br.uern.di.poo.sebastiao.folhadepagamento;

public class TesteVendedor {

	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor("João", 
				"joao@joao.com", "8888888");
		System.out.println("O salário do vendedor é " + vendedor1.getSalario());
		vendedor1.setTotalDeVendas(100000);
		System.out.println("O salário do vendedor é " + vendedor1.getSalario());
		vendedor1.setPercentualDeComissao(0.02);
		System.out.println("O salário do vendedor é " + vendedor1.getSalario());
	}

}

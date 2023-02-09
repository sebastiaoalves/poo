package br.uern.di.poo.sebastiao.folhadepagamento;

public class Vendedor extends Funcionario {
	
	private double totalDeVendas;
	private double percentualDeComissao;
	
	public Vendedor(String nome, String email, String telefone, double totalDeVendas, double percentualDeComissao) {
		super(nome, email, telefone);
		this.totalDeVendas = totalDeVendas;
		this.percentualDeComissao = percentualDeComissao;
		setSalario(totalDeVendas*percentualDeComissao);
	}

	public double getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
		setSalario(totalDeVendas*percentualDeComissao);
	}

	public double getPercentualDeComissao() {
		return percentualDeComissao;
	}

	public void setPercentualDeComissao(double percentualDeComissao) {
		this.percentualDeComissao = percentualDeComissao;
		setSalario(totalDeVendas*percentualDeComissao);
	}
	
	

}

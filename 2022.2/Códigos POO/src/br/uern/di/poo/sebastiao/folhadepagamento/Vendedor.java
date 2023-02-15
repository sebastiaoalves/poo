package br.uern.di.poo.sebastiao.folhadepagamento;

public class Vendedor extends Funcionario {
	
	public static final double PERCENTUAL_MINIMO = 0.01;
	
	private double totalDeVendas;
	private double percentualDeComissao;
	
	public Vendedor(String nome, String email, String telefone) {
		super(nome, email, telefone);
		this.totalDeVendas = 0.0;
		this.percentualDeComissao = PERCENTUAL_MINIMO;
	}
	
	@Override
	public double getSalario() {
		double comissao = totalDeVendas * percentualDeComissao;
		if(comissao > SALARIO_MINIMO)
			return comissao;
		else
			return SALARIO_MINIMO;
	}

	public double getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}

	public double getPercentualDeComissao() {
		return percentualDeComissao;
	}

	public void setPercentualDeComissao(double percentualDeComissao) {
		this.percentualDeComissao = percentualDeComissao;
	}
	
}

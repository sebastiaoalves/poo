package br.uern.di.poo.exemplos.folhadepagamento;

public class Vendedor extends Funcionario{
	
	private static final double PERCENTUAL_COMISSAO = 0.05;
	
	private double totalDeVendas;

	public Vendedor() {
		super();
		this.totalDeVendas = 0.0;
	}

	public Vendedor(String nome, String email, String telefone, double totalDeVendas) {
		super(nome, email, telefone);
		this.totalDeVendas = totalDeVendas;
	}

	public double getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}

	@Override
	public double getSalario() {
		return totalDeVendas * PERCENTUAL_COMISSAO;
	}
	
	

}

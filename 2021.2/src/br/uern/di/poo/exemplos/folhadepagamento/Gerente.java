package br.uern.di.poo.exemplos.folhadepagamento;

public class Gerente extends Funcionario{
	
	private static double SALARIO_FIXO = 5 * SALARIO_MINIMO;
	private Vendedor vendedores[];
	private static double PERCENTUAL_COMISSAO_GERENTE = 0.01;

	public Gerente() {
		super();
		this.vendedores = null;
	}

	public Gerente(String nome, String email, String telefone, Vendedor []vendedores) {
		super(nome, email, telefone);
		this.vendedores = vendedores;
	}

	public Vendedor[] getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}

	@Override
	public double getSalario() {
		double salarioFinal = SALARIO_FIXO;
		double totalDeVendaVendedores = 0.0;
		for (Vendedor v : vendedores)
			totalDeVendaVendedores += v.getTotalDeVendas();
		salarioFinal+= totalDeVendaVendedores * PERCENTUAL_COMISSAO_GERENTE;
		return salarioFinal;
	}
	
}

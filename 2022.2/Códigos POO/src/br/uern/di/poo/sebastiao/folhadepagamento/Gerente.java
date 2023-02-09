package br.uern.di.poo.sebastiao.folhadepagamento;

public class Gerente extends Funcionario {
	
	private double salarioFixo;
	private double percentualDeComissao;
	private Vendedor equipeDeVendedores[];
	public Gerente(String nome, String email, String telefone, double salarioFixo, double percentualDeComissao,
			Vendedor[] equipeDeVendedores) {
		super(nome, email, telefone);
		this.salarioFixo = salarioFixo;
		this.percentualDeComissao = percentualDeComissao;
		this.equipeDeVendedores = equipeDeVendedores;
		setSalario(calculaSalarioGerente());
	}
	
	private double calculaSalarioGerente() {
		double salarioTotal = salarioFixo;
		for (Vendedor v : equipeDeVendedores)
			salarioTotal += v.getTotalDeVendas() * percentualDeComissao;
		return salarioTotal;
	}
	
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
		setSalario(calculaSalarioGerente());
	}
	public double getPercentualDeComissao() {
		return percentualDeComissao;
	}
	public void setPercentualDeComissao(double percentualDeComissao) {
		this.percentualDeComissao = percentualDeComissao;
		setSalario(calculaSalarioGerente());
	}
	public Vendedor[] getEquipeDeVendedores() {
		return equipeDeVendedores;
	}
	public void setEquipeDeVendedores(Vendedor[] equipeDeVendedores) {
		this.equipeDeVendedores = equipeDeVendedores;
		setSalario(calculaSalarioGerente());
	}
	

}

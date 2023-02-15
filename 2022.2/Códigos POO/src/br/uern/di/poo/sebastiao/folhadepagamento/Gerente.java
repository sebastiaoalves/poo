package br.uern.di.poo.sebastiao.folhadepagamento;

public class Gerente extends Funcionario {
	
	public static final double PERCENTUAL_MINIMO = 0.02;
	
	private double salarioFixo;
	private double percentualDeComissao;
	private Vendedor equipeDeVendedores[];
	public Gerente(String nome, String email, String telefone,
			Vendedor[] equipeDeVendedores) {
		super(nome, email, telefone);
		this.salarioFixo = SALARIO_MINIMO;
		this.percentualDeComissao = PERCENTUAL_MINIMO;
		this.equipeDeVendedores = equipeDeVendedores;
	}
	
	@Override
	public double getSalario() {
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
	}
	
	public double getPercentualDeComissao() {
		return percentualDeComissao;
	}
	
	public void setPercentualDeComissao(double percentualDeComissao) {
		this.percentualDeComissao = percentualDeComissao;
	}
	
	public Vendedor[] getEquipeDeVendedores() {
		return equipeDeVendedores;
	}
	
	public void setEquipeDeVendedores(Vendedor[] equipeDeVendedores) {
		this.equipeDeVendedores = equipeDeVendedores;
	}
	
}

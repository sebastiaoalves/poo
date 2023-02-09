package br.uern.di.poo.sebastiao.folhadepagamento;

public class Limpeza extends Funcionario {
	
	private double salarioFixo;
	
	public Limpeza(String nome, String email, String telefone, 
			double salarioFixo) {
		super(nome, email, telefone);
		this.salarioFixo = salarioFixo;
		setSalario(salarioFixo);
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
		setSalario(salarioFixo);
	}

}

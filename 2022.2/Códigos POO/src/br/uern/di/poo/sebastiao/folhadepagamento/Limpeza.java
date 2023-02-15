package br.uern.di.poo.sebastiao.folhadepagamento;

public class Limpeza extends Funcionario {
	
	private double salarioFixo;
	
	public Limpeza(String nome, String email, String telefone) {
		super(nome, email, telefone);
		setSalarioFixo(SALARIO_MINIMO);
	}
	
	@Override
	public double getSalario() {
		return salarioFixo;
	}

	public void setSalarioFixo(double novoSalarioFixo) {
		if(novoSalarioFixo > this.salarioFixo) { 
			this.salarioFixo = novoSalarioFixo;
		}
	}

}

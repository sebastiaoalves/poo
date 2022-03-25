package br.uern.di.poo.exemplos.folhadepagamento;

public class AuxiliarLimpeza extends Funcionario{

	public AuxiliarLimpeza() {
		super();
	}
	
	@Override
	public double getSalario() {
		return SALARIO_MINIMO;
	}

	public AuxiliarLimpeza(String nome, String email, String telefone) {
		super(nome, email, telefone);
	}

}

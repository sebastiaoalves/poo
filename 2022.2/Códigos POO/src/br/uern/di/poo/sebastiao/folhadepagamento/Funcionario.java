package br.uern.di.poo.sebastiao.folhadepagamento;

public abstract class Funcionario extends Pessoa implements Pagavel{
	
	public static final double SALARIO_MINIMO = 1302.0;
	
	public Funcionario(String nome, String email, String telefone) {
		super(nome, email, telefone);
	}
	
}

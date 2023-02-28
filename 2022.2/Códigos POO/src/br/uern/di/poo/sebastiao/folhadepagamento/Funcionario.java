package br.uern.di.poo.sebastiao.folhadepagamento;

public abstract class Funcionario extends Pessoa implements Pagavel, Comparable{
	
	public static final double SALARIO_MINIMO = 1302.0;
	
	@Override
	public int compareTo(Object o) {
		Funcionario f = (Funcionario) o;
		if(this.getSalario() < f.getSalario())
			return -1;
		else if(this.getSalario() == f.getSalario())
			return 0;
		else
			return 1; 
	}
	
	public Funcionario(String nome, String email, String telefone) {
		super(nome, email, telefone);
	}

}

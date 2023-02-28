package br.uern.di.poo.sebastiao.folhadepagamento;

public class Estagiario extends Pessoa implements Pagavel{
	
	private String curso;
	public static final double VALOR_BOLSA = 700.0;

	public Estagiario(String nome, String email, String telefone, String curso) {
		super(nome, email, telefone);
		this.curso = curso;
	}

	@Override
	public double getSalario() {
		return VALOR_BOLSA;
	}
	

}
